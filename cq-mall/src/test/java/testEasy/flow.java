package testEasy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class flow {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        List<Integer> listCur=new ArrayList<>();
        List<Boolean> collect = list.stream().map(listCur::add).collect(Collectors.toList());
        System.out.println(listCur);
        System.out.println(collect);
    }
}
