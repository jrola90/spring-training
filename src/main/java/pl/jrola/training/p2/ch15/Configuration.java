package pl.jrola.training.p2.ch15;

/**
 * Created by JrQ- on 2016-03-19.
 */
@org.springframework.context.annotation.Configuration
public class Configuration {

    @org.springframework.context.annotation.Bean
    public Bean bean() {
        return new Bean();
    }

    @org.springframework.context.annotation.Bean(name = "beanWithName")
    public Bean beanTheSecond() {
        return new Bean();
    }

    @org.springframework.context.annotation.Bean
    public Bean beanWithDependencies() {
        Bean bean = new Bean(beanA());
        return bean;
    }

    @org.springframework.context.annotation.Bean
    public BeanA beanA() {
        BeanA beanA = new BeanA();
        beanA.setProp("Property example");
        return beanA;
    }

}