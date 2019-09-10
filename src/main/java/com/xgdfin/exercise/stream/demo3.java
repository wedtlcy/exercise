package com.xgdfin.exercise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 映射
 * <p>
 * map 使用
 *
 * @author chuanyin.li
 * @date 2019-09-10
 */
public class demo3 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java 8", "Lambdas", "In", "Action");

        words.stream()
                .map(word -> word.length())
                .collect(Collectors.toList())
                .forEach(i -> System.out.println(i));
    }
}
