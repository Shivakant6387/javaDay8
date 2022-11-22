package com.Quize8.com;

import java.util.Arrays;
import java.util.List;

public class Test6 {
    public static void main(String[]args){
        List<Integer>myList= Arrays.asList(12,10,15,8,59,49,98,32,25);
        myList.stream()
                .findFirst()
                .ifPresent(System.out::println);
        long count=myList.stream()
                .count();
        System.out.println(count);
    }
}
