package pl.jrola.training.p2.ch20;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by JrQ- on 2016-03-20.
 */
public class BeanA {

    @Autowired(required = false)
    private BeanB beanB;

    @Override
    public String toString() {
        return "BeanA{" +
                "beanB=" + beanB +
                '}';
    }
}
