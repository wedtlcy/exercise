package com.xgdfin.exercise.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 扁平流 flatMap
 * <p>
 * 列出List中各不相同的单词
 * <p>
 *
 * @author chuanyin.li
 * @date 2019-09-10
 */
public class demo4 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("I am a boy", "I love the girl", "But the girl loves another girl");

        list.stream()
                .map(word -> word.split(" "))   // Stream<String>
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList())
                .forEach(x-> System.out.println(x));

//        collect.forEach(x->{
//            System.out.println(x);
//        });
    }
}
