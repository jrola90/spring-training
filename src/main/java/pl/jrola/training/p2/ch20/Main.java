package pl.jrola.training.p2.ch20;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by JrQ- on 2016-03-20.
 * Using multiple Java context configurations in one app.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        System.out.println(context.getBean("beanA", BeanA.class));

    }

}
