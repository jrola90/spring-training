package pl.jrola.training.p1.ch10;

import org.springframework.beans.factory.BeanNameAware;

/**
 * Created by JrQ- on 2016-03-14.
 */
public class SubBeanA implements BeanNameAware {

    private String name;

    @Override
    public void setBeanName(String s) {
        this.name = s;
    }

    @Override
    public String toString() {
        return "SubBeanA{" +
                "name='" + name + '\'' +
                '}';
    }
}
