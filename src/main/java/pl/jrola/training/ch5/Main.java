package pl.jrola.training.ch5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JrQ- on 2016-03-12.
 * ApplicationContextAware interface - example.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-ch5.xml");
        Singleton singleton = context.getBean("singleton", Singleton.class);

        Prototype prototype1 = singleton.createPrototype();
        Prototype prototype2 = singleton.createPrototype();

        if (prototype1 == prototype2)
            System.out.println("The same object");
        else
            System.out.println("Different object");
    }

}
