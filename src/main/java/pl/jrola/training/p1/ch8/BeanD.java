package pl.jrola.training.p1.ch8;

/**
 * Created by JrQ- on 2016-03-13.
 */
public class BeanD {

    private SubBeanB subB;
    private SubBeanC subC;

    public BeanD() {
        System.out.println("0arg constructor called (BeanD)");
    }

    public BeanD(SubBeanB subB, SubBeanC subC) {
        this.subB = subB;
        this.subC = subC;
        System.out.println("2arg constructor called (BeanD)");
    }

    public SubBeanB getSubB() {
        return subB;
    }

    public void setSubB(SubBeanB subB) {
        this.subB = subB;
    }

    public SubBeanC getSubC() {
        return subC;
    }

    public void setSubC(SubBeanC subC) {
        this.subC = subC;
    }
}
