package com.ice.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ice.common.utils.PageUtils;
import com.ice.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author coldice
 * @email 565044347@qq.com
 * @date 2021-08-25 22:43:41
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

