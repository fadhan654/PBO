package com.example.libraryweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.libraryweb.entity.Member;
import com.example.libraryweb.service.MemberService;
import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping
    public List<Member> findAllMembers() {
        return memberService.findAllMembers();
    }

    @GetMapping("/{id}")
    public Member findMemberById(@PathVariable Long id) {
        return memberService.findMemberById(id);
    }

    @PostMapping("/save")
    public String saveMember(@RequestBody Member member) {
        memberService.saveMember(member);
        return "Member saved successfully";
    }

    @PutMapping("/{id}")
    public String updateMember(@PathVariable Long id, @RequestBody Member member) {
        member.setId(id);
        memberService.saveMember(member);
        return "Member updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteMember(@PathVariable Long id) {
        memberService.deleteMember(id);
        return "Member deleted successfully";
    }
}
