package cn.qtec.study.dubbov.admin.commons.condition;

/**
 * Created by duhc on 2018/2/27.
 */
public class Consumer {
    private Depot depot;

    public Consumer(Depot depot) {
        this.depot = depot;
    }

    public void get(final  int val){
        new Thread(){
            @Override
            public void run() {
                depot.get(val);
            }
        }.start();
    }
}
