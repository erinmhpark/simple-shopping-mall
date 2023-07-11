package simpleshoppingmall.core.order;

import simpleshoppingmall.core.discount.DiscountPolicy;
import simpleshoppingmall.core.discount.FixDiscountPolicy;
import simpleshoppingmall.core.member.Member;
import simpleshoppingmall.core.member.MemberRepository;
import simpleshoppingmall.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new
            MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
