package com.xgdfin.exercise.bean;

/**
 * @author chuanyin.li
 * @create 2019-04-29 14:48
 **/

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xgdfin.exercise.annotation.AnnotationDemo;

import java.util.Date;

/**
 * JSON序列化和反序列化使用的User类
 */
public class User {

    private String name;

    //不JSON序列化年龄属性
    //@JsonIgnore
    private Integer age;

    //格式化日期属性
    @JsonFormat(pattern = "yyyy年MM月dd日")
    @AnnotationDemo(desc = "生日",  nonNull = false)
    private Date birthday;

    //序列化email属性为mail
    @JsonProperty("email")
    @AnnotationDemo(desc = "邮箱", maxLength = "18", minLength = "0", nonNull = true)
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                '}';
    }
}
