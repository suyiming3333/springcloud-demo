package com.sym.orderservicefeign.service;

import com.sym.orderservicefeign.fallback.MemberFeignService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**feign自带负载均衡**/
@FeignClient(value = "member-service",fallback = MemberFeignService.class)
public interface MemberFeign {

    @RequestMapping("/getMemberList")
    List<String> getOrderByUserList();
}
