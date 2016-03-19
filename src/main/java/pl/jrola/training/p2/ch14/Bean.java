package pl.jrola.training.p2.ch14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Created by JrQ- on 2016-03-19.
 *
 */
@Component
public class Bean {

    public Bean() {
        System.out.println("Bean Instantiating");
    }

    @Autowired
    @Lazy
    private BeanA beanA;

    public BeanA getBeanA() {
        return beanA;
    }
}
