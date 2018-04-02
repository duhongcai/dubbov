package cn.qtec.study.dubbov.admin.commons.design.observer;

/**
 * Created by duhc on 2018/3/5.
 */
public interface Subject {
    boolean addObserver(Observer observer);
    boolean delObserver(Observer observer);
    int notifyAllObserver(String message);
}
