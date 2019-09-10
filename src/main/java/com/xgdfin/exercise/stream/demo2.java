package com.xgdfin.exercise.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 筛选元素
 *
 * filter 使用
 * distinct 使用
 * limit 使用
 * skip 使用
 *
 * @author chuanyin.li
 * @date 2019-09-10
 */
public class demo2 {

    public static void main(String[] args) {
        List<Project> projects = Project.buildData();

        List<Project> collect = projects.stream()
                .filter(project -> project.getBugs() > 100)
                .collect(Collectors.toList());
        collect.forEach(e-> System.out.println(e));

        // distinct
        Stream<Integer> numbers = Stream.of(1, 2, 3, 3, 2, 4);
        numbers.distinct().limit(3).forEach(n -> System.out.println(n));

        System.out.println("===================");
        Stream.of(1, 2, 3, 3, 2, 4).skip(4).forEach(n -> System.out.println(n));
    }
}
