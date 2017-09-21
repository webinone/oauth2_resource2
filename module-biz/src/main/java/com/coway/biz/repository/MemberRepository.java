package com.coway.biz.repository;

import com.coway.biz.model.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by foresight on 17. 9. 10.
 */
public interface MemberRepository extends JpaRepository<Member, Long> {

}
