package cn.qtec.study.dubbov.admin.commons.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by duhc on 2018/3/5.
 */
public class JobCenterSubject implements Subject {
    List<Observer> observers;

    public JobCenterSubject() {
       observers = new ArrayList<Observer>();
    }

    public boolean addObserver(Observer observer) {
        if (!observers.contains(observer)){
            observers.add(observer);
            return true;
        }
        return false;
    }

    public boolean delObserver(Observer observer) {
        if (observers.contains(observer)){
            observers.remove(observer);
            return true;
        }
        return false;
    }

    public int notifyAllObserver(String message) {
        if (observers.size() >0){
            for (Observer observer : observers) {
                observer.hearTel(message);
            }
            return observers.size();
        }
        return 0;
    }
}
