package com.sym.orderservicefeign.controller;


import com.sym.orderservicefeign.service.MemberFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private MemberFeign memberFeign;

    @RequestMapping(value = "/getOrderListByMember",produces = { "application/json;charset=UTF-8" })
    public List<String> getUserList() {
        List<String> list = memberFeign.getOrderByUserList();
        return list;
    }
}
