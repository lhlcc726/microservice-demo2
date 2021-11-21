package com.lihoulai.demo.mapper;

import com.lihoulai.demo.entity.Orders;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lihoulai
 * @since 2021-11-21
 */
@Mapper
public interface OrdersMapper extends BaseMapper<Orders> {

}
