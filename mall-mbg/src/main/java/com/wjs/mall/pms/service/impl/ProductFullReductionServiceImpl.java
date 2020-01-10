package com.wjs.mall.pms.service.impl;

import com.wjs.mall.pms.entity.ProductFullReduction;
import com.wjs.mall.pms.mapper.ProductFullReductionMapper;
import com.wjs.mall.pms.service.ProductFullReductionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品满减表(只针对同商品) 服务实现类
 * </p>
 *
 * @author wjs
 * @since 2020-01-09
 */
@Service
public class ProductFullReductionServiceImpl extends ServiceImpl<ProductFullReductionMapper, ProductFullReduction> implements ProductFullReductionService {

}
