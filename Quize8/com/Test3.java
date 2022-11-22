package com.Quize8.com;

import java.util.Arrays;
import java.util.List;

public class Test3 {
    public static void main(String[]args){
        List<Integer>myList= Arrays.asList(10,20,45,49,15,17,18,19,98,32,21);
        myList.stream()
                .map(s ->s+" ")
                .filter(s->s.startsWith("1"))
                .forEach(System.out::println);
    }
}
