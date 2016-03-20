package pl.jrola.training.p2.ch20;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by JrQ- on 2016-03-20.
 */
@Configuration
@Import(value = MySecondConfiguration.class)
public class MyConfiguration {

    @Bean
    public BeanA beanA() {
        return new BeanA();
    }

}
