package com.xgdfin.exercise.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationDemo {

    String desc() default "";

    Class type() default String.class;

    String maxLength() default "";

    String minLength() default "";

    boolean nonNull() default true;

}
