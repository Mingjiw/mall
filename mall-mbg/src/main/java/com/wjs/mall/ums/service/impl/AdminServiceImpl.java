package com.wjs.mall.ums.service.impl;

import com.wjs.mall.ums.entity.Admin;
import com.wjs.mall.ums.mapper.AdminMapper;
import com.wjs.mall.ums.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author wjs
 * @since 2020-01-09
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
