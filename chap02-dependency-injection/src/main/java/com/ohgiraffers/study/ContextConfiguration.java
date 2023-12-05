package com.ohgiraffers.study;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public Account accountgenerator(){
        PersonalAccount account = new PersonalAccount(30,"123-123122");
        return account;
    }

    @Bean
    public MemberDTO DTOgenerator(){         // 세터 사용... 빌더 패턴이 권장됨 불필요한 변경 가능성을 열어 두는 것?
        MemberDTO member = new MemberDTO(1,"김정식","010-123-123","qwe@anver.com",accountgenerator());
                member.setSeq(1);
                member.setName("김정식");
                member.setEmail("jmwe@gfwq.com");
                member.setPhone("123-123-123");
                member.setPersonalAccount(accountgenerator());

        return member;
    }

    @Bean
    public MemberDTO DTOgenerator1(){
        MemberDTO member = MemberDTO.builder()
                .seq(1)
                .name("김준식")
                .email("jmwe@naver.com")
                .phone("010-1232-1242")
                .personalAccount(accountgenerator())
                .build();
        return member;
    }
}
