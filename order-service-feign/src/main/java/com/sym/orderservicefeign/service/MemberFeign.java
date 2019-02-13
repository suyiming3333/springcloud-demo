package com.sym.orderservicefeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("member-service")
public interface MemberFeign {

    @RequestMapping("/getMemberList")
    List<String> getOrderByUserList();
}
