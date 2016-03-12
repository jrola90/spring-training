package pl.jrola.training.ch3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JrQ- on 2016-03-09.
 * Constructing beans with factory method.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-ch3.xml");
        BeanA beanA = context.getBean("beanA", BeanA.class);
        System.out.println(beanA.getDate());

    }

}
