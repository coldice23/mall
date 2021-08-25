package com.ice.gulimall.member.dao;

import com.ice.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author coldice
 * @email 565044347@qq.com
 * @date 2021-08-25 22:50:55
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
