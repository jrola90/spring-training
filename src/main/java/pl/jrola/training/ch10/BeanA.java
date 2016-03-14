package pl.jrola.training.ch10;

import org.springframework.beans.factory.annotation.Autowired;
import pl.jrola.training.ch7.SubBean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by JrQ- on 2016-03-14.
 */
public class BeanA {

    @Autowired
    private SubBeanA[] array;

    @Autowired
    private List<SubBeanA> list;

    @Autowired
    private Map<String, SubBeanA> map;

    public BeanA() {

    }

    @Override
    public String toString() {
        return "BeanA{" +
                "array=" + Arrays.toString(array) +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
