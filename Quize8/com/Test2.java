package com.Quize8.com;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    public static  void main(String[]args){
        List<Integer>myList= Arrays.asList(10,15,20,23,49,98,45,32);
//        Scanner sc=new Scanner(System.in);
//        int myLists=sc.nextInt();
//        System.out.println("Enter of the integer number");
        myList.stream().filter(n->n%2==1).forEach(System.out::println);
    }
}
