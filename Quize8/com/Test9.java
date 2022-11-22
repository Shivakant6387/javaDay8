package com.Quize8.com;

import java.util.Arrays;
import java.util.List;

public class Test9 {
    public static void main(String[]args){
        List<Integer>myList= Arrays.asList(1,7,23,64,33,343,43,21,90,1100,999);
        myList.stream()
                .forEach(System.out::println);

    }
}
