package pl.jrola.training.p2.ch14;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Created by JrQ- on 2016-03-19.
 */
@Component
@Lazy
public class BeanA {

    public BeanA() {
        System.out.println("BeanA Instantiating");
    }

}
