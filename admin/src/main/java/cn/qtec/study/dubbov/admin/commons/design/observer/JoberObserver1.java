package cn.qtec.study.dubbov.admin.commons.design.observer;

/**
 * Created by duhc on 2018/3/5.
 */
public class JoberObserver1 implements Observer{
    Subject subject;

    public JoberObserver1(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    public void hearTel(String message) {
        System.out.println("observer1收到消息：" + message);
    }

}
