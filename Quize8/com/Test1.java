package com.Quize8.com;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer>myList= Arrays.asList(10,15,20,8,49,98,32);
        myList.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
