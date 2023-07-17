package hello.Core.discount;

import hello.Core.member.Grade;
import hello.Core.member.Member;

public class FixDiscountPolicy implements DisCountPolicy {

    private int discountFixAmount = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
