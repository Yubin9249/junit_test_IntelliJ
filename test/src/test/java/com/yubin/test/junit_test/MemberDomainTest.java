package com.yubin.test.junit_test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig
@SpringBootTest
public class MemberDomainTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void testMemberDomain() {
        // 멤버 도메인을 만듬
        MemberDomain member = MemberDomain.builder()
                .id("yyb")
                .name("yunyubin")
                .build();

        // 만든 도메인을 DB에 저장
        memberRepository.save(member);

        // 도메인의 객체를 DB에서 검색
        MemberDomain savedMember = memberRepository.findById(member.getMbrNo()).orElse(null);

        // 설정한 값이 존재하면 테스트 성공
        assert savedMember != null;
        assertEquals("yyb", savedMember.getId());
        assertEquals("yunyubin", savedMember.getName());
    }
}
