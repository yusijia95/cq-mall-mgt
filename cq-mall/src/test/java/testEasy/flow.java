package testEasy;

import java.util.*;
import java.util.stream.Collectors;

public class flow {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        List<Integer> listCur = new ArrayList<>();
        List<Boolean> collect = list.stream().map(listCur::add).collect(Collectors.toList());
//        list.removeIf(t->t==1);
//        List<Boolean> collect1 = list.stream().map(list::remove).collect(Collectors.toList());
        System.out.println(Calendar.getInstance().get(Calendar.YEAR));
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next.equals(1)) {
                iterator.remove();
            }
        }
        System.out.println(list);
//        System.out.println(collect1);
        System.out.println(listCur);
        System.out.println(collect);
    }
}
