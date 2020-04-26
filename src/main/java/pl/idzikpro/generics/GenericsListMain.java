package pl.idzikpro.generics;

import java.util.Arrays;
import java.util.List;

public class GenericsListMain {
    public static void main(String[] args) {
        MyGenericList<Integer> list=new MyGenericList<>();
        list.addElement(13);
        list.addElement(12);
        list.removeElement(13);
        System.out.println("Elements :"+list.getList());

        List<Byte> bytes= Arrays.asList(
                Byte.parseByte("12"),
                Byte.parseByte("13"));
        System.out.println("Sum :"+list.sum(bytes));
    }
}
