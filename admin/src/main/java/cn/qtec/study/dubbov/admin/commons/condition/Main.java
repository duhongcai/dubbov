package cn.qtec.study.dubbov.admin.commons.condition;

/**
 * Created by duhc on 2018/2/27.
 */
public class Main {
    public static void main(String[] args) {
        Depot depot  = new Depot();
        Producer producer = new Producer(depot);
        Consumer consumer = new Consumer(depot);
        producer.produce(10);
        consumer.get(5);
        producer.produce(5);
        consumer.get(10);
        producer.produce(8);
        consumer.get(4);
        consumer.get(4);
    }
}
