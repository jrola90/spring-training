package pl.jrola.training.p1.ch6;

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
