package pl.jrola.training.p2.ch15;

/**
 * Created by JrQ- on 2016-03-19.
 */
public class BeanA {

    private String prop;

    public BeanA() {
    }

    public BeanA(String prop) {
        this.prop = prop;
    }

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "prop='" + prop + '\'' +
                '}';
    }
}
