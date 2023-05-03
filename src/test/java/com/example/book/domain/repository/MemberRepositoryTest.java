package com.example.book.domain.repository;

import com.example.book.domain.entity.Member;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void 회원생성(){
        //given
        Member member = Member.builder()
                .email("jongdoo2001@naver.com")
                .name("테스트")
                .password("test")
                .build();


        //when
        memberRepository.Save(member);

        //then
        Member resultMember = memberRepository.findOne(member.getId());

        assertEquals(member.getEmail(), resultMember.getEmail(), "같아야 한다");

    }

}