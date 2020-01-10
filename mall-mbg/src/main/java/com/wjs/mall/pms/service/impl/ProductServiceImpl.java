package com.wjs.mall.pms.service.impl;

import com.wjs.mall.pms.entity.Product;
import com.wjs.mall.pms.mapper.ProductMapper;
import com.wjs.mall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author wjs
 * @since 2020-01-09
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
