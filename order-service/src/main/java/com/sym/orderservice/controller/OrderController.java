package com.sym.orderservice.controller;

import com.sym.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/getOrderListByMenber",produces = { "application/json;charset=UTF-8" })
    public List<String> getUserList() {
        List<String> list = orderService.getOrderByUserList();
        return list;
    }
}
