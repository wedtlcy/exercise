package com.xgdfin.exercise.java8.stream;

import java.util.List;

/**
 * 匹配元素
 * <p>
 * allMatch 使用
 * anyMatch 使用
 * noneMatch 使用
 * findFirst 使用
 * findAny 使用
 *
 * @author chuanyin.li
 * @date 2019-09-10
 */
public class demo5 {

    public static void main(String[] args) {
        List<Project> projects = Project.buildData();

        boolean hasTester = projects.stream()
                .anyMatch(p -> p.getTester().equals("test3"));

        System.out.println(hasTester);

        System.out.println(projects.stream()
                .allMatch(p -> p.getTester().equals("test1")));

        System.out.println(projects.stream()
                .noneMatch(p -> p.getTester().equals("test4")));

        System.out.println(projects.stream().findAny().get());
        System.out.println(projects.stream().findFirst().get());
    }

}
