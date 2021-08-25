package com.ice.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ice.common.utils.PageUtils;
import com.ice.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author coldice
 * @email 565044347@qq.com
 * @date 2021-08-24 22:24:41
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

