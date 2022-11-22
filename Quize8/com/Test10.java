package com.Quize8.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test10 {
    public static void main(String[]args){
        List<Integer>myList=Arrays.asList(1,2,4,5,6,7,8,9,8,7,66,7,5,6,54,36,90,63,6,2,67,98,78);
        Stream<Integer>list=myList.stream();
        myList.stream().forEach(System.out::println);
        System.out.println(list);
    }
}
