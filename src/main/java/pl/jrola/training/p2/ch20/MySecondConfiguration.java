package pl.jrola.training.p2.ch20;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by JrQ- on 2016-03-20.
 */
@Configuration
public class MySecondConfiguration {

    @Bean
    public BeanB beanB() {
        return new BeanB();
    }

}
