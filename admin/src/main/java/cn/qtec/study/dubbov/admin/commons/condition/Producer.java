package cn.qtec.study.dubbov.admin.commons.condition;

/**
 * Created by duhc on 2018/2/27.
 */
public class Producer {
    private Depot depot;

    public Producer(Depot depot) {
        this.depot = depot;
    }

    public void produce(final int val){
        new Thread(){
            @Override
            public void run() {
              depot.put(val);
            }
        }.start();
    }

}
