package pl.jrola.training.ch1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // search bean by id
        HelloService helloService = context.getBean("id1", HelloService.class);
        HelloService helloService2 = context.getBean("id2", HelloService.class);

        System.out.println(helloService.sayHello());
        System.out.println(helloService2.sayHello());

        // search bean by name
        HelloService helloService3 = context.getBean("name1", HelloService.class);
        System.out.println(helloService3.sayHello());

    }
}
