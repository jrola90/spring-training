package pl.jrola.training.p2.ch16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by JrQ- on 2016-03-19.
 * Spring configuration in Java (autowiring and component scan).
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
        Bean beanWithDependencies = context.getBean("beanWithDependencies", Bean.class);
        System.out.println(beanWithDependencies);
    }
}
