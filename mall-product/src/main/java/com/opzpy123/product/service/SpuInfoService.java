package com.opzpy123.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.opzpy123.common.utils.PageUtils;
import com.opzpy123.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author opzpy123
 * @email 1441120973@qq.com
 * @date 2021-01-09 17:44:32
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

