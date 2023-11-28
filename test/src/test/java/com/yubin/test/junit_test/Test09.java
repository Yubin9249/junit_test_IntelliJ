package com.yubin.test.junit_test;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

//테스트 메서드의 실행 순서를 제어하기 위해 사용
//MethodOrderer.OrderAnnotation.class를 지정, @Order 어노테이션을 사용하여 순서를 지정
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Test09 {

    private static final Calculator calculator = new Calculator();
    private static int result;

    @Test
    @Order(3)
    void testMultiplication() {
        result = calculator.multiply(result, 2);
        assertEquals(8, result);
        System.out.println("--- 3 번째");
    }

    @Test
    @Order(4)
    void testDivision() {
        result =  (int)calculator.divide(result, 2);
        assertEquals(4, result);
        System.out.println("--- 4 번째");
    }

    @Test
    @Order(1)
    void testAddition() {
        result = calculator.add(5, 3);
        assertEquals(8, result);
        System.out.println("--- 1 번째");
    }

    @Test
    @Order(2)
    void testSubtraction() {
        result = calculator.subtract(result, 4);
        assertEquals(4, result);
        System.out.println("--- 2 번째");
    }
}

//코드 상 순서가 다르지만 @Order를 통해 순서를 지정하여 실행가능
