package pl.jrola.training.p2.ch11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JrQ- on 2016-03-17.
 * Qualifiers. Writing custom qualifier.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-ch11.xml");
        Bean bean = context.getBean("bean", Bean.class);

        System.out.println(bean);

    }

}
