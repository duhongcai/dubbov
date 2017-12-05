package cn.qtec.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by duhc on 2017/12/5.
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        context.start();
        DemoService service = (DemoService) context.getBean("demoService");
        String hello = service.sayHello("duhc");
        System.out.println(hello);
    }
}
