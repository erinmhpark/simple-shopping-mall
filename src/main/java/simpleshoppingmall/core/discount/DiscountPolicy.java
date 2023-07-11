package simpleshoppingmall.core.discount;

import simpleshoppingmall.core.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
