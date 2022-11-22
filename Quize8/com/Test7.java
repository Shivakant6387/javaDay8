package com.Quize8.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test7 {
    public static void main(String[] args) {
        List<Integer>myList= Arrays.asList(12,20,32,45,49,98,8,32);
        List<Integer>unique=
        myList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(unique);
        int max=myList.stream().max(Integer::compare).get();
        System.out.println(max);
    }
}
