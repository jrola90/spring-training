package pl.jrola.training.p2.ch19;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JrQ- on 2016-03-20.
 * Using multiple context files in one app.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-ch19_1.xml");
        System.out.println(context.getBean("beanA", BeanA.class));

    }

}
