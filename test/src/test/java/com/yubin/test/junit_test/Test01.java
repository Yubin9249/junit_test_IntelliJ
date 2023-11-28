package com.yubin.test.junit_test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test01 {


        @Test //테스트 할 메소드에 @Test 작성
        @Tag("성공")
        public void testAddition1() {

        int a = 5;
        int b = 7;

        //junit_test의 패키지에 있는 MathUtils 파일의 add 메소드를 불러옴
        int result = MathUtils.add(a, b);
        assertEquals(12, result);
        }

        @Test
        @Tag("실패")
        public void testAddition2() {

            int a = 5;
            int b = 7;

            int result = MathUtils.add(a, b);
            assertEquals(13, result);
        }
}

//테스트 실행시 testAddition1은 성공하지만 testAddition2는 실패함
