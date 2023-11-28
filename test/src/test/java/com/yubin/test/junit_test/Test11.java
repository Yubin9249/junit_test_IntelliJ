package com.yubin.test.junit_test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class Test11{

    @Test
    //메서드의 타임아웃 설정 (밀리초단위)
    @Timeout(value = 200, unit = java.util.concurrent.TimeUnit.MILLISECONDS)
    void testWithCustomTimeout1() throws InterruptedException {
        Thread.sleep(100);
    }

    @Test
    @Timeout(value = 200, unit = java.util.concurrent.TimeUnit.MILLISECONDS)
    void testWithCustomTimeout2() throws InterruptedException {
        Thread.sleep(300);
    }
}

//실행되는 메소드의 타임아웃을 지정하여 설정 시간이 지날시 테스트 실패


