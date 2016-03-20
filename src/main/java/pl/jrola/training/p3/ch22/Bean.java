package pl.jrola.training.p3.ch22;

/**
 * Created by JrQ- on 2016-03-20.
 */
public class Bean {

    private String name;

    public Bean(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "name='" + name + '\'' +
                '}';
    }
}
