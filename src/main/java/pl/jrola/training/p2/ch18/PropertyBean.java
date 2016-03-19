package pl.jrola.training.p2.ch18;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by JrQ- on 2016-03-20.
 */
@Component(value = "propertyBean")
public class PropertyBean {

    @Value(value="${ch18.prop1}")
    private String prop1;

    @Value(value="${ch18.prop2}")
    private String prop2;

    @Override
    public String toString() {
        return "PropertyBean{" +
                "prop1='" + prop1 + '\'' +
                ", prop2='" + prop2 + '\'' +
                '}';
    }
}
