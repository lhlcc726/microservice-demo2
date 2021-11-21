package com.lihoulai.demo.service.impl;

import com.lihoulai.demo.entity.OrderItems;
import com.lihoulai.demo.mapper.OrderItemsMapper;
import com.lihoulai.demo.service.OrderItemsService;
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
public class OrderItemsServiceImpl extends ServiceImpl<OrderItemsMapper, OrderItems> implements OrderItemsService {

}
