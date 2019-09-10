package com.xgdfin.exercise.java8.stream;

import java.util.Arrays;
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
 */
public class Demo1 {
    public static void main(String[] args) {
        String[] names = {"福田项目","衢州项目","龙华项目"};
        Stream<String> stream = Arrays.stream(names);

        stream.forEach(e-> System.out.println(e));

        Stream<String> stream1 = Stream.of("福田项目","衢州项目","龙华项目");

        //创建无限流
        Stream.iterate(0, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);
    }
}
