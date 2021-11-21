package com.lihoulai.demo.controller;


import com.lihoulai.demo.entity.Customers;
import com.lihoulai.demo.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lihoulai
 * @since 2021-11-21
 */
@RestController
@RequestMapping("/customers")
public class CustomersController {
    @Autowired
    private CustomersService customersService;
    @GetMapping(value = "/findAllCustomers")
    public List<Customers>findAllCustomers(){
        //ModelAndView modelAndView=new ModelAndView();
        //modelAndView.setViewName("index");
        //modelAndView.addObject("customerList",customersService.findAllCustomers());
       //return modelAndView;
        return customersService.findAllCustomers();
    }
    @GetMapping(value = "/getCustomerById")
    public Customers getCustomerById(@RequestParam("id") Long id){
        return customersService.getCustomerById(id);
    }

}

