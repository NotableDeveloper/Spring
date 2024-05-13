package org.example.springshop.discount;


import org.example.springshop.member.Grade;
import org.example.springshop.member.Member;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class RateDiscountPolicy implements DiscountPolicy{
    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) return price / discountPercent;
        else return 0;
    }
}
