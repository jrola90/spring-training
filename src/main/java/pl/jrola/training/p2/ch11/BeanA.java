package pl.jrola.training.p2.ch11;

import org.springframework.beans.factory.BeanNameAware;

/**
 * Created by JrQ- on 2016-03-17.
 */
public class BeanA implements BeanNameAware{

    @Override
    public void setBeanName(String s) {
        this.name = s;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                '}';
    }
}
