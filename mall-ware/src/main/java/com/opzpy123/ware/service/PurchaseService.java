package com.opzpy123.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.opzpy123.common.utils.PageUtils;
import com.opzpy123.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author opzpy123
 * @email 1441120973@qq.com
 * @date 2021-01-10 19:39:56
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

