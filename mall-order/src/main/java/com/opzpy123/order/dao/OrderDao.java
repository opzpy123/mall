package com.opzpy123.order.dao;

import com.opzpy123.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author opzpy123
 * @email 1441120973@qq.com
 * @date 2021-01-10 18:22:28
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
