package pl.idzikpro.generics;

import java.util.ArrayList;
import java.util.List;

public class MyGenericList<T extends Number> {
    private List<T> list;

    public void addElement(T t) {
        list.add(t);
    }

    public void removeElement(T t) {
        list.remove(t);
    }

    public MyGenericList() {
        list = new ArrayList<T>();
    }

    public List<T> getList() {
        return list;
    }
    public double sum(List<? extends Number> list){
        double sum=0;
        for (Number number:list
             ) {
            sum=sum+number.doubleValue();
        }
        return sum;
    }
}
