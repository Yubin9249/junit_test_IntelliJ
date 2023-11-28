package com.yubin.test.junit_test;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test07 {

    @TestFactory // 동적 테스트를 생성하는 메서드를 표현
    Collection<DynamicTest> testStringReversal() {
        return Arrays.asList(
                dynamicTest("Reverse 'Hello'", () -> {
                    String reversed = reverseString("Hello");
                    assertEquals("olleH", reversed);
                }),
                dynamicTest("Reverse 'JUnit'", () -> {
                    String reversed = reverseString("JUnit");
                    assertEquals("tnIUJ", reversed);
                })
        );
    }

    // 문자열을 뒤집는 역할
    private String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // 테스트 이름과 실행 가능한 코드를 인수로 받아 동적 테스트를 생성
    private DynamicTest dynamicTest(String testName, Executable executable) {
        return DynamicTest.dynamicTest(testName, executable);
    }
}

//'JUnit' 문자열은 'tinUJ'이 되어야 함