package com.Quize8.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test8 {
    public static void main(String[]args){
        List<Integer>myList= Arrays.asList(10,20,8,49,98,17,15,17,16,17,16);
        List<Integer>unique=myList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(unique);
        int min=myList.stream()
                .min(Integer::compare).get();
        System.out.println(min);
    }
}
