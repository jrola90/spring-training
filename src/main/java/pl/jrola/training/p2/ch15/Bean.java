package pl.jrola.training.p2.ch15;

import org.springframework.beans.factory.BeanNameAware;

/**
 * Created by JrQ- on 2016-03-19.
 */
public class Bean implements BeanNameAware {
    private String beanName;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "beanName='" + beanName + '\'' +
                '}';
    }
}
