package com.xgdfin.exercise.java8.stream;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * 根据tester进行分组
 * <p>
 * Collectors.groupingBy
 * <p>
 * 然后根据项目分组
 *
 * @author chuanyin.li
 * @date 2019-09-10
 */
public class Demo8 {

    public static void main(String[] args) {
        List<Project> projects = Project.buildData();
        Map<String, List<Project>> collect = projects.stream()
                .collect(groupingBy(Project::getAuthor));
        System.out.println(collect);

        Map<String, Map<String, Long>> collect1 = projects.stream()
                .collect(groupingBy(Project::getAuthor,
                        groupingBy(p -> {
                            if ("java".equalsIgnoreCase(p.getLanguage()) ||
                                    "python".equalsIgnoreCase(p.getLanguage())) {
                                return "后端";
                            }
                            return "前端";
                        }, counting())
                ));
        System.out.println(collect1);
    }
}
