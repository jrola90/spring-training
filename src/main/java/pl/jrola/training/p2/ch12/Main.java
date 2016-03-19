package pl.jrola.training.p2.ch12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JrQ- on 2016-03-19.
 * Resource annotation.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-ch12.xml");
        Bean bean = context.getBean("bean", Bean.class);
        System.out.println(bean);

    }


}
