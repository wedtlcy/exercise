package com.xgdfin.exercise.java8.stream;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
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
    public static void main(String[] args) throws Exception {
        String[] names = {"福田项目","衢州项目","龙华项目"};
        //Arrays.stream
        Stream<String> stream = Arrays.stream(names);

        stream.forEach(e-> System.out.println(e));

        Stream<String> stream1 = Stream.of("福田项目","衢州项目","龙华项目");

        // Java 7 例子
        // Files.readAllBytes默认以UTF-8编码读入文件，故文件的编码如果不是UTF-8，那么中文内容会出现乱字符
        System.out.println(new String(Files.readAllBytes(Paths.get("D:\\Demo1.txt"))));

        // Java8用流的方式读文件，更加高效
        Files.lines(Paths.get("D:\\Demo1.txt"), StandardCharsets.UTF_8).forEach(System.out::println);

        //创建无限流 Stream.iterate
        Stream.iterate(0, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);
    }
}
