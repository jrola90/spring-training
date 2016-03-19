package pl.jrola.training.p1.ch8;

/**
 * Created by JrQ- on 2016-03-13.
 */
public class BeanC {

    private SubBeanB subBeanB;
    private SubBeanC subBeanC;

    public BeanC(SubBeanB subBeanB) {
        this.subBeanB = subBeanB;
        System.out.println("1arg constructor called (BeanC)");
    }

    public BeanC(SubBeanB subBeanB, SubBeanC subBeanC) {
        this.subBeanB = subBeanB;
        this.subBeanC = subBeanC;
        System.out.println("2arg constructor called (BeanC)");
    }
}
