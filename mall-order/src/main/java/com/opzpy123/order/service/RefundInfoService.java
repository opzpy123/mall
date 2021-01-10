package com.opzpy123.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.opzpy123.common.utils.PageUtils;
import com.opzpy123.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author opzpy123
 * @email 1441120973@qq.com
 * @date 2021-01-10 18:22:28
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

