package pl.jrola.training.p2.ch16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by JrQ- on 2016-03-19.
 */
@Component
public class BeanA {

    @Autowired
    @Value("sample string")
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
