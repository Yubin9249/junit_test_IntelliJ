package com.yubin.test.junit_test;

import jakarta.persistence.*;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "test")
public class MemberDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mbrNo;

    private String id;

    private String name;

}
