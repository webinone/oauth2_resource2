package com.coway.biz.service;

import com.coway.biz.model.domain.Member;
import java.util.List;

/**
 * Created by foresight on 17. 9. 10.
 */
public interface MemberService {

    List<Member> findAll();

    Member find(Long id);

}
