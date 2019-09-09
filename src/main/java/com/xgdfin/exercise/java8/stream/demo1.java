package com.xgdfin.exercise.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 创建流
 * <p>
 * Stream.of
 * Arrays.stream
 * collection.stream
 * Files.lines
 * Stream.iterate
 *
 * @author chuanyin.li
 * @date 2019-09-10
 */
public class demo1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world");
        Stream<String> stream = list.stream();

        Stream<String> stringStream = Arrays.stream(new String[]{"hello", "world"});

        Stream<String> stream1 = Stream.of("hello", "world");

        stream1.forEach(e-> System.out.println(e));
    }
}
