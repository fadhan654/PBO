package com.example.libraryweb.service;

import com.example.libraryweb.entity.Member;
import com.example.libraryweb.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public List<Member> findAllMembers() {
        return memberRepository.findAll();
    }

    public Member findMemberById(Long id) {
        return memberRepository.findById(id).orElse(null);
    }

    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }

    public void deleteMember(Long id) {
        memberRepository.deleteById(id);
    }
}
