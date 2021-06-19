package com.dns.pjdocker.service;

import com.dns.pjdocker.domain.Member;
import com.dns.pjdocker.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class MemberService {

        private final MemberRepository memberRepository;

        public void save(Member member) {
                memberRepository.save(member);
        }

        @Transactional(readOnly = true)
        public List<Member> getMembers() {
                return memberRepository.findAll();
        }

}
