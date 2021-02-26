package com.ghost.cloudprovider.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * @Company 北京卡尔卡拉科技股份有限公司
 * @Author NorthernGhost
 * @Description
 * @Date 2021/2/25 10:29
 * @Version 1.0
 */
@Service
/**
 * 开启配置自动刷新，需要刷新的配置在哪里就配置在哪里。
 */
@RefreshScope
public class TestServiceImpl {



    @Value("${config.info}")
    private String configInfo;

    public String getConfigInfo() throws Exception {
        return configInfo;
    }


}
