package pl.jrola.training.p1.ch2;

/**
 * Created by JrQ- on 2016-03-07.
 */
public class BeanB {

    private String param;

    public BeanB(String param) {
        System.out.println("Constructor - Bean B, param: " + param);
        this.param = param;
    }

    @Override
    public String toString() {
        return "BeanB{" +
                "param='" + param + '\'' +
                '}';
    }
}
