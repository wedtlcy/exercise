package com.xgdfin.exercise.java8.stream;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.partitioningBy;

/**
 * 数据分区
 * <p>
 * Collectors.partitioningBy
 * <p>
 * 根据tester将项目分为两组
 *
 * @author chuanyin.li
 * @date 2019-09-10
 */
public class Demo9 {

    public static boolean isBackEnd(Project project){
        return "test1".equalsIgnoreCase(project.getTester()) || "test2".equalsIgnoreCase(project.getTester());
    }

    public static void main(String[] args) {
        List<Project> projects = Project.buildData();

        Map<Boolean, List<Project>> collect = projects.stream()
                .collect(partitioningBy(Demo9::isBackEnd));
        System.out.println(collect);
    }
}
