package pl.jrola.training.p3.ch21;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JrQ- on 2016-03-20.
 * PostConstruct i PreDestroy methods.
 */
public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config-ch21.xml");
        BeanA beanA = context.getBean("beanA", BeanA.class);
        System.out.println(beanA);
        context.close();

    }

}
