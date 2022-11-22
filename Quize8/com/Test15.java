package com.Quize8.com;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test15 {
    public static void main(String[]args){
        String input="Pramod is an Indian";
        Character result=input.chars()
                .mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
                        .entrySet()
                        .stream()
                        .filter(entry -> entry.getValue() == 1L)
                        .map(entry -> entry.getKey())
                        .findFirst()
                        .get();
        System.out.println(result);
    }
}
