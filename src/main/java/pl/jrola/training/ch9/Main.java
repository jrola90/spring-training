package pl.jrola.training.ch9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JrQ- on 2016-03-14.
 * Auto-wiring with annotations.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-ch9.xml");
        BeanA beanA = context.getBean("beanA", BeanA.class);
        System.out.println(beanA);


    }

}
