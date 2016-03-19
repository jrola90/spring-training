package pl.jrola.training.p1.ch7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JrQ- on 2016-03-12.
 * Collections injection.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-ch7.xml");
        Bean bean = context.getBean("bean", Bean.class);

        System.out.println(bean);

    }

}
