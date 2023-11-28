package com.yubin.test.junit_test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;

//테스트 클래스에 확장을 적용, LoggingExtension은 BeforeEachCallback을 구현하고 beforeEach 메서드를 오버라이드하여 간단한 로깅을 수행
@ExtendWith(LoggingExtension.class)
public class Test12 {

    @Test
    void test1() {
        System.out.println("테스트1");
    }

    @Test
    void test2() {
        System.out.println("테스트2");
    }
}

class LoggingExtension implements org.junit.jupiter.api.extension.BeforeEachCallback {

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        System.out.println("Before each test: " + context.getDisplayName());
    }
}

//실행시 오버라이드를 통해 "Before each test : 메소드명"이 출력되고 해당 메소드가 실행되는 것을 볼 수 있음




