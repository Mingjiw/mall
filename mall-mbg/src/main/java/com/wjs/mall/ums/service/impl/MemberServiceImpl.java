package com.wjs.mall.ums.service.impl;

import com.wjs.mall.ums.entity.Member;
import com.wjs.mall.ums.mapper.MemberMapper;
import com.wjs.mall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author wjs
 * @since 2020-01-09
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
