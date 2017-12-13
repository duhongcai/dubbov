package cn.qtec.study;

/**
 * Created by duhc on 2017/12/5.
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello "+name;
    }

}
