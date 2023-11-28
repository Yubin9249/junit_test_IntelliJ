package com.yubin.test.junit_test;

import java.util.Random;

public class MathUtils {

    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
