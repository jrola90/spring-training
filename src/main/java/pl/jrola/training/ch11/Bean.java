package pl.jrola.training.ch11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by JrQ- on 2016-03-17.
 */
public class Bean {

    @Autowired
    @Qualifier(value = "beanA2")
    private BeanA beanA;

    @Autowired
    @Qualifier(value = "beanA1qualifier")
    private BeanA beanA2;

    @Autowired
    @MyBean
    private BeanA beanA3;

    @Override
    public String toString() {
        return "Bean{" +
                "beanA=" + beanA +
                ", beanA2=" + beanA2 +
                ", beanA3=" + beanA3 +
                '}';
    }
}
