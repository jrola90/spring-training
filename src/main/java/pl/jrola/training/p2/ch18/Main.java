package pl.jrola.training.p2.ch18;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JrQ- on 2016-03-20.
 * Reading properties file.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-ch18.xml");
        System.out.println(context.getBean("propertyBean",PropertyBean.class));

    }

}
