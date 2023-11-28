package com.yubin.test.junit_test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(MemberController.class)
public class MemberControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean //모의 객체 생성
    private MemberRepository memberRepository;

    @Test
    public void testIndexPage() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/index.html"))
                // HTTP 상태 코드가 200인지 확인합니다.
                .andExpect(MockMvcResultMatchers.status().isOk())
                // 뷰 이름이 "/index"인지 확인
                .andExpect(MockMvcResultMatchers.view().name("/index"));
    }
}

//template 패키지 > index.html 파일 존재
