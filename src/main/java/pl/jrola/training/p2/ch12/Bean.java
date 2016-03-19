package pl.jrola.training.p2.ch12;

import javax.annotation.Resource;

/**
 * Created by JrQ- on 2016-03-17.
 */
public class Bean {

    @Resource
    private BeanA beanAA;

    @Override
    public String toString() {
        return "Bean{" +
                "beanA=" + beanAA +
                '}';
    }
}
