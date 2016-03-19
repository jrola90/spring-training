package pl.jrola.training.p2.ch16;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by JrQ- on 2016-03-19.
 */
@Component(value = "beanWithDependencies")
public class Bean implements BeanNameAware {
    private String beanName;

    @Autowired
    private BeanA beanA;

    public Bean() {
    }

    public Bean(BeanA beanA) {
        this.beanA = beanA;
    }

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "beanName='" + beanName + '\'' +
                ", beanA=" + beanA +
                '}';
    }
}
