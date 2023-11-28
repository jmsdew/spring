package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("configurationSection02")          // 설정정보 관리 어노테이션  - xml 파일을 대신함
public class ContextConfiguration {

    @Bean(name = "member")
    public MemberDTO getMember(){
        return new MemberDTO(1,"user02","pass","홍길동");
    }
}
