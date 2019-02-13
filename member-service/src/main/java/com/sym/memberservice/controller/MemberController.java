package com.sym.memberservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MemberController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/getMemberList")
    public List<String> getUserList() {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        List<String> listUser = new ArrayList<String>();
        listUser.add("zhangsan");
        listUser.add("lisi");
        listUser.add("yushengjun");
        listUser.add("serverPort:"+serverPort);
        return listUser;
    }
}
