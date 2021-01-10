package com.opzpy123.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.opzpy123.common.utils.PageUtils;
import com.opzpy123.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author opzpy123
 * @email 1441120973@qq.com
 * @date 2021-01-10 16:37:22
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

