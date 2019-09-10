package com.xgdfin.exercise.java8.stream;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.toCollection;

/**
 * 转换类型
 * <p>
 * Collectors.toCollection
 * <p>
 * Collectors.collectingAndThen
 * <p>
 * Collectors.maxBy
 * <p>
 * Collectors.minBy
 * <p>
 * 按照devloper筛选出bug数最高的项目
 *
 * @author chuanyin.li
 * @date 2019-09-10
 */
public class Demo10 {

    public static void main(String[] args) {
        List<Project> projects = Project.buildData();

        Collection<Project> collect = projects.stream()
                .collect(toCollection(CopyOnWriteArrayList::new));
        System.out.println(collect);

        Map<String, Project> collect1 = projects.stream()
                .collect(groupingBy(Project::getDevloper, collectingAndThen(
                        maxBy(Comparator.comparingInt(Project::getBugs)),
                        Optional::get
                )));
        System.out.println(collect1);
    }
}
