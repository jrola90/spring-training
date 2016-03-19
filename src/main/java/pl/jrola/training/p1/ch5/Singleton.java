package pl.jrola.training.p1.ch5;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by JrQ- on 2016-03-12.
 */
public class Singleton implements ApplicationContextAware {

    private Prototype prototype;
    private ApplicationContext applicationContext;

    public Singleton() {
    }

    public Prototype createPrototype() {
        return applicationContext.getBean("prototype", Prototype.class);
    }

    public void setPrototype(Prototype prototype) {
        this.prototype = prototype;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
