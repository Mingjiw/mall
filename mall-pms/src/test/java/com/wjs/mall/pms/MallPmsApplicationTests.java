package com.wjs.mall.pms;

import com.wjs.mall.pms.entity.Brand;
import com.wjs.mall.pms.entity.Product;
import com.wjs.mall.pms.service.BrandService;
import com.wjs.mall.pms.service.ProductService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class MallPmsApplicationTests {

    @Autowired
    ProductService productService;

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        /*Product byId = productService.getById(1);
        System.out.println(byId.getName());*/
        Brand byId = brandService.getById(53);
        System.out.println(byId.getName());
    }

}
