package com.yubin.test.junit_test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.RepeatedTest;

public class Test06 {

    @RepeatedTest(10) // @RepeatedTest(지정된 횟수)만큼 테스트 메서드 실행을 반복
    void testRandomNumber() {

        //MathUtils 파일의 generateRandomNumber = 100까지의 랜덤한 숫자를 생성 하는 메서드
        int randomNumber = MathUtils.generateRandomNumber();

        //0 이상이며 50 이하일 숫자일시 테스트 성공
        assertTrue(randomNumber >= 0 && randomNumber <= 50);
    }
}

//10번의 실행결과가 매 실행 결과가다름