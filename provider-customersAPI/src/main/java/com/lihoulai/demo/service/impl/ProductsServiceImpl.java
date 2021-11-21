package com.lihoulai.demo.service.impl;

import com.lihoulai.demo.entity.Products;
import com.lihoulai.demo.mapper.ProductsMapper;
import com.lihoulai.demo.service.ProductsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lihoulai
 * @since 2021-11-21
 */
@Service
public class ProductsServiceImpl extends ServiceImpl<ProductsMapper, Products> implements ProductsService {

}
