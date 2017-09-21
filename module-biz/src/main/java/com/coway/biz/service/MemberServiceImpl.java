package com.coway.biz.service;

import com.coway.biz.model.domain.Member;
import com.coway.biz.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by foresight on 17. 9. 10.
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberRepository memberRepository;

    public List<Member> findAll() {
        return this.memberRepository.findAll();
    }

    public Member find(Long id) {
        return this.memberRepository.findOne(id);
    }

}
