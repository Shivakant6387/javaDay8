package com.Quize8.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test4 {
    public static void main(String[]args){
        List<Integer>myList= Arrays.asList(10,15,19,8,49,25,98,98,49,32,15);
        Set<Integer>set=new HashSet<>();
        myList.stream()
                .filter(n->set.add(n))
                .forEach(System.out::println);
    }
}
