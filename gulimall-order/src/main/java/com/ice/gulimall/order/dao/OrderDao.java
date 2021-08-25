package com.ice.gulimall.order.dao;

import com.ice.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author coldice
 * @email 565044347@qq.com
 * @date 2021-08-25 23:07:25
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
