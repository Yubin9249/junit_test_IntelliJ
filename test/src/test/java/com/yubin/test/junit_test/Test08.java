package com.yubin.test.junit_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

//테스트 인스턴스의 생명주기를 설정, TestInstance.Lifecycle.PER_METHOD 옵션은 매 테스트 메서드마다 새로운 인스턴스를 생성하도록 지정
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class Test08 {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAddition() {
        int result = calculator.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    void testSubtraction() {
        int result = calculator.subtract(10, 3);
        assertEquals(7, result);
    }
}

//두개의 테스트 메소드가 result를 공유하고 있지만 매 테스트마다 인스턴스를 생성하기 때문에 두 개의 테스트가 성공한 것을 볼수 있음

