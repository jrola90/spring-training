package pl.jrola.training.p1.ch3;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by JrQ- on 2016-03-09.
 */
public class BeanA {

    private Calendar calendar;

    public BeanA(Calendar calendar) {
        this.calendar = calendar;
    }

    public Date getDate() {
        return calendar.getTime();
    }
}
