package com.xgdfin.exercise.annotation;


import com.xgdfin.exercise.bean.User;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * 自定义注解解析
 *
 * @author chuanyin.li
 * @create 2019-05-08 15:02
 **/
public class AnnotationTest {


    @Test
    public void analysisAnnotationTest(){
        Field[] declaredFields = User.class.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            Field declaredField = declaredFields[i];
            String fieldName = declaredField.getName();
            AnnotationDemo annotation = declaredField.getAnnotation(AnnotationDemo.class);
            if (annotation == null) {
                continue;
            }

            String desc = annotation.desc();

            String maxLength = annotation.maxLength();

            String minLength = annotation.minLength();

            boolean nonNull = annotation.nonNull();

            Class type = annotation.type();

            System.out.println(String.format("fieldName=%s, desc=%s, maxLength=%s, minLength=%s, nonNull=%s, type=%s",fieldName,desc,maxLength,minLength,nonNull,type));


        }
    }
}
