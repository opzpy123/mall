package com.opzpy123.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.opzpy123.common.utils.PageUtils;
import com.opzpy123.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author opzpy123
 * @email 1441120973@qq.com
 * @date 2021-01-10 17:59:34
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

