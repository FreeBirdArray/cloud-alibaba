package com.ghost.cloudprovider.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @Company 北京卡尔卡拉科技股份有限公司
 * @Author NorthernGhost
 * @Description
 * @Date 2021/2/25 14:02
 * @Version 1.0
 */
public class BlockHandler {

    // blockHandler 函数，当原方法调用被限流、降级、系统保护的时候调用
    public static String blockHandlerForGetInfo(BlockException ex){
        System.out.println("qps太高啦");
        return "qps太高啦";
    }
}
