package com.wjs.mall.oms.service.impl;

import com.wjs.mall.oms.entity.OrderItem;
import com.wjs.mall.oms.mapper.OrderItemMapper;
import com.wjs.mall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author wjs
 * @since 2020-01-09
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
