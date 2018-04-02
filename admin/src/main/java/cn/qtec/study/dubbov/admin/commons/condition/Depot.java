package cn.qtec.study.dubbov.admin.commons.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by duhc on 2018/2/27.
 */
public class Depot {
    private  int size;
    private  Lock lock;
    private Condition notNullCondition;
    private Condition notFullCondition;

    public Depot() {
        size = 0;
        lock = new ReentrantLock();
        notFullCondition = lock.newCondition();
        notNullCondition = lock.newCondition();
    }

    public void put(int val){
        try{
            lock.lock();
            while (size + val >20 ){
                notFullCondition.await();
            }
            size += val;
            notNullCondition.signal();
            System.out.println("仓库进货--->" + val + ";  此时共有存货-->" + size);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void get(int val){
        try{
            lock.lock();
            while (size - val < 0){
                notNullCondition.await();
            }
            size -= val;
            notFullCondition.signal();
            System.out.println("仓库出货--->"+val + ";  此时还剩存货-->"+size);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
