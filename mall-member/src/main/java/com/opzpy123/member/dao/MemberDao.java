package com.opzpy123.member.dao;

import com.opzpy123.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author opzpy123
 * @email 1441120973@qq.com
 * @date 2021-01-10 17:59:34
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
