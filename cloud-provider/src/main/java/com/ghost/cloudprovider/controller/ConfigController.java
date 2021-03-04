package com.ghost.cloudprovider.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.ghost.cloudprovider.fallback.FallBackHandler;
import com.ghost.cloudprovider.handler.BlockHandler;
import com.ghost.cloudprovider.service.TestServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @Company 北京卡尔卡拉科技股份有限公司
 * @Author NorthernGhost
 * @Description
 * @Date 2021/2/22 10:12
 * @Version 1.0
 */
@RestController
@RequestMapping("/config")
public class ConfigController {


    @Resource
    private TestServiceImpl testService;



    /** 当 blockHandler 函数与方法在同一个包时只需要 blockHandler 参数，该参数的值就是 blockHandler 函数名字
     *  当 blockHandler 函数和方法不再同一个包时，需要 blockHandlerClass 参数和 blockHandler 配合使用，
     *  blockHandlerClass 值为 blockHandler 函数所在类的Class对象，blockHandler 值为 blockHandler函数名字
     *  1. blockHandler 函数访问修饰符应为 public
     *  2. blockHandler 函数的参数应该和被处理方法一致并且在最后还要加上 BlockException ex 作为参数
     *  3. blockHandler 函数返回值应与被处理方法一致
     *  4. blockHandler 函数与被处理方法不再一个包时应该为 static 函数
     */
    @GetMapping("/info")
    @SentinelResource(value = "info",blockHandlerClass = {BlockHandler.class},blockHandler = "blockHandlerForGetInfo",
            fallbackClass = {FallBackHandler.class},fallback = "fallBackForGetInfo")
    public String getConfigInfo() throws Exception {
        return testService.getConfigInfo();
    }

    @GetMapping("/info1")
    public String getConfigInfo1() throws Exception {
        return testService.getConfigInfo();
    }


    @PostMapping("/uploadVideo.do")
    public void upload(@Valid @ModelAttribute NakednessAudioUploadRequest request) {
        System.out.println(request);
        System.out.println("收到请求！");


    }



}
