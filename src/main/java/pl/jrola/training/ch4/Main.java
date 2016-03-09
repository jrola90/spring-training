package pl.jrola.training.ch4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JrQ- on 2016-03-10.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-ch4.xml");

        Singleton singleton1 = context.getBean("singleton", Singleton.class);
        Singleton singleton2 = context.getBean("singleton", Singleton.class);

        if(singleton1 == singleton2)
            System.out.println("This is singleton");

        Prototype prototype1 = context.getBean("prototype", Prototype.class);
        Prototype prototype2 = context.getBean("prototype", Prototype.class);

        if(prototype1 != prototype2)
            System.out.println("This is prototype");

    }

}
