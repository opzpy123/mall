package com.opzpy123.product;

import com.opzpy123.product.entity.AttrEntity;
import com.opzpy123.product.entity.BrandEntity;
import com.opzpy123.product.service.AttrService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    private AttrService attrService;

    @Test
    void contextLoads() {
        AttrEntity attrEntity = new AttrEntity();
        attrEntity.setAttrName("测试1");
        attrService.save(attrEntity);
        System.out.println(attrService.list());
    }

}
