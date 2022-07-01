package filedemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo5 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("aaa");
        l.add("abc");
        l.add("abb");
        l.add("bbb");
        l.add("ccc");
        Stream<String> stm = l.stream();
//        List<String> l1 = stm.filter(s->s.startsWith("a")).collect(Collectors.toList());

        List<String> l1 = stm.filter(s->s.contains("b")).map(s->s+"aaa").collect(Collectors.toList());
        System.out.println(l1);
    }


}
