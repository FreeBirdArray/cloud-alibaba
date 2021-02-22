package com.ghost.cloudconsuamer1.controller;


import com.ghost.cloudconsuamer1.service.OrderServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @Company 北京卡尔卡拉科技股份有限公司
 * @Author NorthernGhost
 * @Description
 * @Date 2020/12/25 11:40
 * @Version 1.0
 */
@RestController
@RequestMapping("/consumer")
public class TestController {
    @Resource
    private OrderServiceImpl orderService;

    @GetMapping("/info")
    public String getConfigInfo(){
        return orderService.getConfigInfo();
    }
    @GetMapping("/info1")
    public String getConfigInfo1(){
        return "hello";
    }

}
