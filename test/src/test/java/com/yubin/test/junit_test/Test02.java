package com.yubin.test.junit_test;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test02 {


        @Test
        @DisplayName("더하기 테스트1") //@DisplayName("사용자 설정 이름") 사용자가 설정한 이름이 테스트 결과 이름으로 변경 됨
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

//실행시 @DisplayName을 통해 설정했던 이름이 테스트 결과에 나타남

