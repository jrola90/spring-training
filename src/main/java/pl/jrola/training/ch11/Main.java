package pl.jrola.training.ch11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JrQ- on 2016-03-17.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-ch11.xml");
        Bean bean = context.getBean("bean", Bean.class);

        System.out.println(bean);

    }

}