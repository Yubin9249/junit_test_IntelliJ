package com.yubin.test.junit_test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test10 {

    @Test
    void testEnabled() {
        int result = 2 + 2;
        assertEquals(4, result);
    }

    @Disabled
    @Test
    void testDisabled() {
        // 비활성화되었으므로 실행되지 않음
        int result = 3 * 3;
        assertEquals(9, result);
    }
}

// @Disabled를 통해 'testDisabled'가 실행되지 않는 것을 확인




