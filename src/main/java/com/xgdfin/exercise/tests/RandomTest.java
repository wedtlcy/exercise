package com.xgdfin.exercise.tests;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author chuanyin.li
 * @create 2019-05-16 7:05
 **/
public class RandomTest {
    static Random rdm = new Random();
    static int random(int n){
        return Math.abs(rdm.nextInt()) % n;
    }

    public static void main(String[] args) {
        int n = 2 * (Integer.MAX_VALUE / 3);
        int low = 0;
        for (int i = 0; i < 1000000; i++) {
            if(random(n) < n/2)
                low++;
        }
        System.out.println(low);

        System.out.println(ThreadLocalRandom.current().nextInt());
    }
}
