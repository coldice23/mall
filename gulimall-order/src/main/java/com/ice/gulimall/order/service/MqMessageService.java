package com.ice.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ice.common.utils.PageUtils;
import com.ice.gulimall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author coldice
 * @email 565044347@qq.com
 * @date 2021-08-25 23:07:25
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

