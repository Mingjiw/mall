package com.wjs.mall.oms.service.impl;

import com.wjs.mall.oms.entity.Order;
import com.wjs.mall.oms.mapper.OrderMapper;
import com.wjs.mall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author wjs
 * @since 2020-01-09
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
