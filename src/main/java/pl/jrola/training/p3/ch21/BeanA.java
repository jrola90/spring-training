package pl.jrola.training.p3.ch21;

/**
 * Created by JrQ- on 2016-03-20.
 */
public class BeanA {

    private BeanB beanB;

    public BeanA() {
        System.out.println("BeanA.BeanA");
    }

    public void init() {
        System.out.println("BeanA.init");
    }

    public void destroy() {
        System.out.println("BeanA.destroy");
    }

    public void setBeanB(BeanB beanB) {
        System.out.println("BeanA.setBeanB");
        this.beanB = beanB;
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "beanB=" + beanB +
                '}';
    }
}
