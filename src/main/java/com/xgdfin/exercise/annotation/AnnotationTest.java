package com.xgdfin.exercise.annotation;


import com.xgdfin.exercise.bean.User;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * 自定义注解解析
 *
 * @author: chuanyin.li
 * @date: 2019/5/8
 **/
public class AnnotationTest {

    /** 
    * @description:  解析自定义注解
    * @param: [] 
    * @return: void 
    * @author: chuanyin.li
    * @date: 2019/5/8
    */ 
    @Test
    public void analysisAnnotationTest() {
        Field[] declaredFields = User.class.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            Field declaredField = declaredFields[i];
            String fieldName = declaredField.getName();
            AnnotationDemo annotation = declaredField.getAnnotation(AnnotationDemo.class);
            if (annotation == null) {
                continue;
            }

            //获取注解描述
            String desc = annotation.desc();
            //获取长度
            String maxLength = annotation.maxLength();
            //获取最小长度
            String minLength = annotation.minLength();
            //获取是否为空
            boolean nonNull = annotation.nonNull();

            System.out.println(String.format("fieldName=%s, desc=%s, maxLength=%s, minLength=%s, nonNull=%s, type=%s", fieldName, desc, maxLength, minLength, nonNull));


        }
    }
}
