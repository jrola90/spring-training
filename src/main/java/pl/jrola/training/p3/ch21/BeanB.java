package pl.jrola.training.p3.ch21;

/**
 * Created by JrQ- on 2016-03-20.
 */
public class BeanB {

    public BeanB() {
        System.out.println("BeanB.BeanB");
    }

    public void init() {
        System.out.println("BeanB.init");
    }

    public void destroy() {
        System.out.println("BeanB.destroy");
    }
}
