package com.yubin.test.junit_test;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test04 {

    @BeforeEach //테스트 클래스의 각 테스트 메서드 전에 실행
    void beforeEach() {
        System.out.println("--- @BeforeEach");
    }

    @AfterEach //테스트 클래스의 각 테스트 메서드 후에 실행
    void afterEach() {
        System.out.println("--- @AfterEach");
    }

    @BeforeAll //테스트 클래스의 모든 테스트 메서드 전에 한 번 실행
    static void beforeAll() {
        System.out.println("--- @BeforeAll");
    }

    @AfterAll //테스트 클래스의 모든 테스트 메서드가 실행된 후 한 번 실행
    static void afterAll() {
        System.out.println("--- @AfterAll");
    }

    @Nested
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

//실행 결과를 통해 해당 어노테이션의 순서를 확인 가능 
