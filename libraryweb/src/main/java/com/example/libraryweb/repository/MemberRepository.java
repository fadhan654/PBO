package com.example.libraryweb.repository;

import com.example.libraryweb.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
