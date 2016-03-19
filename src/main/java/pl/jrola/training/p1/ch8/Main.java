package pl.jrola.training.p1.ch8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JrQ- on 2016-03-12.
 * Autowiring: by type, by name, by constructor, default.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-ch8.xml");

        // wiring by type
        BeanA beanA = context.getBean("beanA", BeanA.class);
        System.out.println(beanA);

        // wiring by name
        BeanB beanB = context.getBean("beanB", BeanB.class);
        System.out.println(beanB);

        // wiring by constructor
        BeanC beanC = context.getBean("beanC", BeanC.class);
        System.out.println(beanC);

        // wiring default
        BeanD beanD = context.getBean("beanD", BeanD.class);
        System.out.println(beanD);

    }

}