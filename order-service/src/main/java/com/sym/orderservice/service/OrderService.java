package com.sym.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    RestTemplate restTemplate;

    public List<String> getOrderByUserList() {
        return restTemplate.getForObject("http://member-service/getMemberList", List.class);
    }
}
