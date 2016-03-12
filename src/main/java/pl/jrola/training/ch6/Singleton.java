package pl.jrola.training.ch6;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by JrQ- on 2016-03-12.
 */
public abstract class Singleton {

    private Prototype prototype;

    public Singleton() {
    }

    public abstract Prototype createPrototype();

    public void setPrototype(Prototype prototype) {
        this.prototype = prototype;
    }

}
