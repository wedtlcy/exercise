package com.xgdfin.exercise.java8.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

/**
 * 将结果收集到 Map 中
 * <p>
 * Collectors.toMap
 * Function.identity()
 *
 * @author chuanyin.li
 * @date 2019-09-10
 */
public class Demo7 {

    public static void main(String[] args) {
        List<Project> projects = Project.buildData();

        Map<String, Integer> collect = projects.stream()
                .collect(toMap(Project::getName, Project::getStars));
        System.out.println(collect);

        Map<String, Project> collect1 = projects.stream()
                .collect(toMap(Project::getName, Function.identity()));
        System.out.println(collect1);
    }
}
