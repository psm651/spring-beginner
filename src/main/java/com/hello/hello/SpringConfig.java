package com.hello.hello;

import com.hello.hello.repository.*;
import com.hello.hello.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {
    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

//    private EntityManager em;
//    @Autowired
//    public SpringConfig(EntityManager em) {
//        this.em = em;
//    }

    //    private DataSource dataSource;
//
//    @Autowired
//    public SpringConfig(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

//    @Bean // AOP를 명시하는게 좋지만 여기선 @Component 사용
//    public TimeTraceAop timeTraceAop() {
//        return new TimeTraceAop();
//    }

    //@Bean
    //public MemberRepository memberRepository(){
        //return new MemoryMemberRepository();
        //return new JdbcMemberRepository(dataSource);
//        return new JdbcTemplateMemberRepository(dataSource);
       // return new JpaMemberRepository(em);

    //}

}
