package simpleshoppingmall.core.member;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import simpleshoppingmall.core.member.Grade;
import simpleshoppingmall.core.member.Member;
import simpleshoppingmall.core.member.MemberService;
import simpleshoppingmall.core.member.MemberServiceImpl;

public class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();
    
    @Test
    void join() {
        // given
        Member member = new Member(1L, "Peter", Grade.VIP);
        // when 
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        // then
//        Assertions.assertThat(member).isEqualTo(findMember);
        org.assertj.core.api.Assertions.assertThat(member).isEqualTo(findMember);
    }
}
