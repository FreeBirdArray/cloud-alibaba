package com.ghost.cloudconsuamer1.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Company 北京卡尔卡拉科技股份有限公司
 * @Author NorthernGhost
 * @Description
 * @Date 2021/2/22 16:05
 * @Version 1.0
 */
@FeignClient(name = "cloud-provider/config")
public interface OrderServiceImpl {

    @GetMapping("/info")
    String getConfigInfo();



}
