package com.ice.gulimall.coupon.dao;

import com.ice.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author coldice
 * @email 565044347@qq.com
 * @date 2021-08-25 22:43:41
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
