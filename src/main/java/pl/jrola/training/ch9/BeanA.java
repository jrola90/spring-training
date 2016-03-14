package pl.jrola.training.ch9;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by JrQ- on 2016-03-14.
 */
public class BeanA {

    @Autowired
    private SubBeanA subBeanA;

    private SubBeanB subBeanB;

    public BeanA() {
        System.out.println("BeanA.BeanA");
    }

    @Autowired
    public BeanA(SubBeanA subBeanA, SubBeanB subBeanB) {
        this.subBeanA = subBeanA;
        this.subBeanB = subBeanB;
        System.out.println("BeanA.BeanA-2");
    }

    public SubBeanA getSubBeanA() {
        return subBeanA;
    }

    public void setSubBeanA(SubBeanA subBeanA) {
        System.out.println("BeanA.setSubBeanA");
        this.subBeanA = subBeanA;
    }

    public SubBeanB getSubBeanB() {
        return subBeanB;
    }

    @Autowired
    public void setSubBeanB(SubBeanB subBeanB) {
        System.out.println("BeanA.setSubBeanB");
        this.subBeanB = subBeanB;
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "subBeanA=" + subBeanA +
                ", subBeanB=" + subBeanB +
                '}';
    }
}
