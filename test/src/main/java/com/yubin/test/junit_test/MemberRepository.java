package com.yubin.test.junit_test;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberDomain, Long> {
}
