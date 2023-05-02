package com.example.book.domain.repository;

import com.example.book.domain.Member;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final EntityManager em;

    /*
     * 회원 생성
     */
    public void Save(Member member){
        em.persist(member);
    }

    /*
     * 회원 선택
     */
    public Member findOne(Long id){
        return em.find(Member.class, id);
    }
}
