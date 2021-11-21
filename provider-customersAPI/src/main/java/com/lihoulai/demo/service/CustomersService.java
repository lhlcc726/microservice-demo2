package com.lihoulai.demo.service;

import com.lihoulai.demo.entity.Customers;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lihoulai
 * @since 2021-11-21
 */
public interface CustomersService extends IService<Customers> {
    public List<Customers> findAllCustomers();
    public Customers getCustomerById(Long id);
}
