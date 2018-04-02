package cn.qtec.study.dubbov.admin.commons.design.observer;

/**
 * Created by duhc on 2018/3/5.
 */
public class JoberObserver2 implements Observer{
    Subject subject;

    public JoberObserver2(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    public void hearTel(String message) {
        System.out.println("observer2收到消息：" + message);
    }

}
