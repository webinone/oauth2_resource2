package com.coway.web.controller;

import com.coway.biz.model.domain.Member;
import com.coway.biz.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * Created by foresight on 17. 9. 10.
 */
@RestController
@RequestMapping("/api/v1")
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping(value = "/members")
    public List<Member> getMembers() {
        return this.memberService.findAll();
    }

    @GetMapping(value = "/member/{id}")
    public Member getMember(@PathVariable Long id) {
        return this.memberService.find(id);
    }
}
