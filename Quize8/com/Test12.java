package com.Quize8.com;

import java.util.stream.Stream;

public class Test12 {
    public static void main(String[]args){
        String[]language={"Java","Python","JavaScript","PHP"};
        Stream.of(language).forEach(System.out::println);
    }
}
