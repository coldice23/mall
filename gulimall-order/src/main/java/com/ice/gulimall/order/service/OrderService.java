package com.ice.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ice.common.utils.PageUtils;
import com.ice.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author coldice
 * @email 565044347@qq.com
 * @date 2021-08-25 23:07:25
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

