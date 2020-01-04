package com.xgdfin.exercise.effective;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Set;

/**
 * Effective java 65条  接口优先于反射
 * @author chuanyin.li
 * @create 2019-05-17 6:18
 **/
public class TreeSet {
    public static void main(String[] args) {

        //Translate the class name into a Class object
        Class<? extends Set<String>> c1 = null;
        try {
            c1 = (Class<? extends Set<String>>) Class.forName(args[0]);
        } catch (ClassNotFoundException e) {
            fatalError("Class not found.");
        }

        //Get the constructor
        Constructor<? extends Set<String>> cons = null;
        try {
            cons = c1.getDeclaredConstructor();
        } catch (NoSuchMethodException e) {
            fatalError("No paramterless constructor");
        }

        //Insantiate the set
        Set<String> s = null;
        try {
            s = cons.newInstance();
        } catch (InstantiationException e) {
            fatalError("Constructor not accessible");
        } catch (IllegalAccessException e) {
            fatalError("Class not instantible");
        } catch (InvocationTargetException e) {
            fatalError("Construtor threw"+e.getCause());
        } catch (ClassCastException e){
            fatalError("Class doesn't implement Set");
        }
        //Exercise the set
        s.addAll(Arrays.asList(args).subList(1, args.length));
        System.out.println(s);
    }

    private static void fatalError(String s) {
        System.out.println(s);
        System.exit(1);
    }
}
