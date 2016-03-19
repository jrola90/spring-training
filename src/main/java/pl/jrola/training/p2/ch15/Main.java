package pl.jrola.training.p2.ch15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by JrQ- on 2016-03-19.
 * Spring configuration in Java.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);

        Bean bean = context.getBean("bean", Bean.class);
        System.out.println(bean);

        Bean beanWithName = context.getBean("beanWithName", Bean.class);
        System.out.println(beanWithName);
    }
}
