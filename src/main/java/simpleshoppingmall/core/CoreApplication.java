package simpleshoppingmall.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import simpleshoppingmall.core.member.Grade;
import simpleshoppingmall.core.member.Member;
import simpleshoppingmall.core.member.MemberService;
import simpleshoppingmall.core.member.MemberServiceImpl;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		MemberService memberService = new MemberServiceImpl();
		Member member = new Member(1L, "memberA", Grade.VIP);
		memberService.join(member);

		Member findMember = memberService.findMember(1L);
		System.out.println("new member = " + member.getName());
		System.out.println("find Member = " + findMember.getName());
	}

}
