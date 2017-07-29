package com.springmvc.service;

import com.springmvc.Repository.MemberRepository;
import com.springmvc.data.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jotaiwan on 29/07/2017.
 */
@Service
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public List<Member> findAll() {
        return memberRepository.findAll();
    }
}
