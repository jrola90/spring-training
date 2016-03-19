package pl.jrola.training.p2.ch17;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * Created by JrQ- on 2016-03-19.
 * Resources.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        ResourceBean bean = context.getBean("resourceBean", ResourceBean.class);
        bean.printResourcesContent();

    }

}
