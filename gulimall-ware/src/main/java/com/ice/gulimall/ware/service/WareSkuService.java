package com.ice.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ice.common.utils.PageUtils;
import com.ice.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author coldice
 * @email 565044347@qq.com
 * @date 2021-08-25 23:12:32
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

