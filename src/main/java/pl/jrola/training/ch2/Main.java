package pl.jrola.training.ch2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JrQ- on 2016-03-07.
 * Constructing beans with XML.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-ch2.xml");

        BeanA beanA1 = context.getBean("beanA1", BeanA.class);
        System.out.println(beanA1);

        BeanA beanA2 = context.getBean("beanA2", BeanA.class);
        System.out.println(beanA2);

    }

}
