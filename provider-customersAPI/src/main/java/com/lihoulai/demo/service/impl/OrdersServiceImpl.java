package com.lihoulai.demo.service.impl;

import com.lihoulai.demo.entity.Orders;
import com.lihoulai.demo.mapper.OrdersMapper;
import com.lihoulai.demo.service.OrdersService;
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
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

}
