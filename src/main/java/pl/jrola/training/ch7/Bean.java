package pl.jrola.training.ch7;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by JrQ- on 2016-03-12.
 */
public class Bean {

    private List<SubBean> list;
    private Set<String> set;
    private Map<Integer, String> map;

    public Bean() {

    }

    public List<SubBean> getList() {
        return list;
    }

    public void setList(List<SubBean> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }
}
