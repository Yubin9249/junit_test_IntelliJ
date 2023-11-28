package com.yubin.test.junit_test;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test03 {

    @Nested //결과 화면에서 그룹화 할 테스트를 하나의 클래스로 묶어서 해당 클래스에 @Nested 어노테이션 사용
    @DisplayName("더하기")
    class testAddition{

        @Test
        @DisplayName("더하기 테스트1")
        public void testAddition1() {

        int a = 5;
        int b = 7;

        int result = MathUtils.add(a, b);
        assertEquals(12, result);
        System.out.println("--- 더하기 테스트1");
        }

        @Test
        @DisplayName("더하기 테스트2")
        public void testAddition2() {

            int a = 5;
            int b = 8;

            int result = MathUtils.add(a, b);
            assertEquals(13, result);
            System.out.println("--- 더하기 테스트2");
        }
    }
}

//'더하기 테스트1'과 '더하기 테스트2'를 '더하기'라는 하나의 클래스로 묶음 
