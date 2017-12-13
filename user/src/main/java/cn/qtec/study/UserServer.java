package cn.qtec.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by duhc on 2017/12/5.
 */
public class UserServer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{("dubbo-user-provider.xml")});
        context.start();
        System.out.println("服务开启");
        System.in.read();
    }
}
