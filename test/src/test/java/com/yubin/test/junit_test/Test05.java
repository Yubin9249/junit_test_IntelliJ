package com.yubin.test.junit_test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test05 {

    @ParameterizedTest //여러 입력 매개변수 세트를 사용하여 동일한 테스트 메서드를 실행
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void testIsEven(int number) {

        //MathUtils의 매개변수가 짝수 인지 확인하는 isEven 메서드 사용
        assertTrue(MathUtils.isEven(number));
    }
}

//결과 화면을 통해 짝수가 아닌 숫자들은 실패, 짝수인 숫자들은 성공한 것을 확인