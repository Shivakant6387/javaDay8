package com.Quize8.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test5 {
    public static void main(String[]args){
        List<Integer>myList= Arrays.asList(10,15,10,20,49,98,98,49,24,20,25);
        Set<Integer>set=new HashSet<>();
        myList.stream()
                .filter(s->!set.add(s))
                .forEach(System.out::println);
    }
}
