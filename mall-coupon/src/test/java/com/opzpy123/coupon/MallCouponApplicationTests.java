package com.opzpy123.coupon;

import com.opzpy123.coupon.entity.CouponEntity;
import com.opzpy123.coupon.service.CouponService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.ws.Action;

@SpringBootTest
class MallCouponApplicationTests {
    @Autowired
    private CouponService couponService;

    @Test
    void contextLoads() {
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("haha");
        couponService.save(couponEntity);
        System.out.println(couponService.list());
    }

}
