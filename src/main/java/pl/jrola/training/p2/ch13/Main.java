package pl.jrola.training.p2.ch13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JrQ- on 2016-03-19.
 * Component scanning.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-ch13.xml");
        Bean bean = context.getBean("magicBean", Bean.class);
        System.out.println(bean);

    }
}
