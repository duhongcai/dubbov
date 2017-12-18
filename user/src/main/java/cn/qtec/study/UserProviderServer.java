package cn.qtec.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by duhc on 2017/12/5.
 * 启动用户服务
 */
public class UserProviderServer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{("dubbo-user-provider.xml")});
        context.start();
        System.out.println("服务开启");
        //阻塞进程 避免服务退出
        System.in.read();
    }
}
