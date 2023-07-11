package simpleshoppingmall.core.order;

import simpleshoppingmall.core.member.Grade;
import simpleshoppingmall.core.member.Member;
import simpleshoppingmall.core.member.MemberService;
import simpleshoppingmall.core.member.MemberServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("Order = " + order);
        System.out.println("Order.calculatePrice = " + order.calculatePrice());

    }
}
