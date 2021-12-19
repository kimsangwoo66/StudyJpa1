package jpabook.jpashop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository
{ //리포지토리는 엔터티를 찾아주는 역활을 한다. DAO랑 비슷하다고 판단

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member){ //커맨드랑 쿼리를 분리해라
        em.persist(member);
        return member.getId();

    }

    public Member find(Long id){ //jpa 조회문
        return em.find(Member.class, id);
    }

}
