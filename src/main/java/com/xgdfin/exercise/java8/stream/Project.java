package com.xgdfin.exercise.java8.stream;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @devloper chuanyin.li
 * @create 2019-09-10
 **/
@Data
@Builder
public class Project {

    /**
     * 项目名称
     */
    private String name;

    /**
     * 测试人员
     */
    private String tester;

    /**
     * 开发人员
     */
    private String devloper;

    /**
     * 已解决bug数
     */
    private Integer solvedBugs;

    /**
     * bug 数
     */
    private Integer bugs;

    /**
     * 描述
     */
    private String description;


    public static List<Project> buildData() {
        List<Project> data = new ArrayList<>();

        data.add(Project.builder().name("福田项目").tester("test1").devloper("dev1")
                .bugs(35).solvedBugs(20).description("福田项目企业服务发展协同").build());

        data.add(Project.builder().name("衢州项目").tester("test2").devloper("dev2")
                .bugs(26).solvedBugs(23).description("衢州镇企银项目").build());

        data.add(Project.builder().name("龙华项目").tester("test1").devloper("dev3")
                .bugs(83).solvedBugs(73).description("龙华商信秀").build());

        data.add(Project.builder().name("SOA产品").tester("test3").devloper("dev4")
                .bugs(105).solvedBugs(30).description("生产数据服务").build());

        data.add(Project.builder().name("INS机构客户端").tester("test1").devloper("dev5")
                .bugs(20).solvedBugs(10).description("INS机构客户端").build());

        return data;
    }
}
