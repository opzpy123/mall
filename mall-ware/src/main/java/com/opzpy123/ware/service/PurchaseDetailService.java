package com.opzpy123.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.opzpy123.common.utils.PageUtils;
import com.opzpy123.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author opzpy123
 * @email 1441120973@qq.com
 * @date 2021-01-10 19:39:56
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

