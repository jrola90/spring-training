package pl.jrola.training.p1.ch6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JrQ- on 2016-03-12.
 * Method injection.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-ch6.xml");
        Singleton singleton = context.getBean("singleton", Singleton.class);

        Prototype prototype1 = singleton.createPrototype();
        Prototype prototype2 = singleton.createPrototype();

        if (prototype1 == prototype2)
            System.out.println("The same object");
        else
            System.out.println("Different object");

    }

}
