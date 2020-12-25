package com.ghost.cloudprovider1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Company 北京卡尔卡拉科技股份有限公司
 * @Author NorthernGhost
 * @Description
 * @Date 2020/12/25 13:43
 * @Version 1.0
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${server.port}")
    private String port;
    @Value("${spring.application.name}")
    private String appName;
    @GetMapping("/echo/{id}")
    public String test(@PathVariable String id){
        return "本次访问服务是 ["+appName+"] ,端口是 ["+port+"]: "+id;
    }
}
