package com.wjs.mall.oms.service.impl;

import com.wjs.mall.oms.entity.CartItem;
import com.wjs.mall.oms.mapper.CartItemMapper;
import com.wjs.mall.oms.service.CartItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author wjs
 * @since 2020-01-09
 */
@Service
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements CartItemService {

}
