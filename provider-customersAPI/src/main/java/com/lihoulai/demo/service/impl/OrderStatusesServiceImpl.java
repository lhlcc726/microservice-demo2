package com.lihoulai.demo.service.impl;

import com.lihoulai.demo.entity.OrderStatuses;
import com.lihoulai.demo.mapper.OrderStatusesMapper;
import com.lihoulai.demo.service.OrderStatusesService;
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
public class OrderStatusesServiceImpl extends ServiceImpl<OrderStatusesMapper, OrderStatuses> implements OrderStatusesService {

}
