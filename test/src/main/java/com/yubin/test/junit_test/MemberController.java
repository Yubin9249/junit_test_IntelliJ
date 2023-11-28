package com.yubin.test.junit_test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    private final MemberRepository memberRepository;


    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @GetMapping("/index.html")
    public String index(){
        return "/index";
    }
}
