package pl.jrola.training.p3.ch22;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JrQ- on 2016-03-20.
 * Spring profiles.
 */
public class Main {

    public static void main(String[] args) {

        System.setProperty("spring.profiles.active", "prod");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-ch22.xml");
        System.out.println(context.getBean("bean"));

    }

}
