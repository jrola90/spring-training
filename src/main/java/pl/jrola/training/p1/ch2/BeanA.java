package pl.jrola.training.p1.ch2;

/**
 * Created by JrQ- on 2016-03-07.
 */
public class BeanA {

    private BeanB beanB;

    public BeanA() {
    }

    public BeanA(BeanB beanB) {
        this.beanB = beanB;
        System.out.println("Constructor - Bean A");
    }

    public BeanB getBeanB() {
        System.out.println("Getter - Bean A");
        return beanB;
    }

    public void setBeanB(BeanB beanB) {
        System.out.println("Setter - Bean A");
        this.beanB = beanB;
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "beanB=" + beanB +
                '}';
    }
}
