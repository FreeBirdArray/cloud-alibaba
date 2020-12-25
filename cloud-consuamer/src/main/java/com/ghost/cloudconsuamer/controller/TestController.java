package com.ghost.cloudconsuamer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    private LoadBalancerClient loadBalancerClient;
    @Value("${server.port}")
    private String port;
    @Value("${spring.application.name}")
    private String appName;
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/echo/app-name")
    public String echoAppName(){
        //使用 LoadBalanceClient 和 RestTemolate 结合的方式来访问
        ServiceInstance serviceInstance = loadBalancerClient.choose("cloud-provider");
        String url = String.format("http://%s:%s/test/echo/%s",serviceInstance.getHost(),serviceInstance.getPort(),appName);
        System.out.println("request url:"+url);
        return restTemplate.getForObject(url,String.class);
    }

}
