package com.ghost.cloudprovider.fallback;

/**
 * @Company 北京卡尔卡拉科技股份有限公司
 * @Author NorthernGhost
 * @Description
 * @Date 2021/2/26 10:43
 * @Version 1.0
 */
public class FallBackHandler {


    public static String fallBackForGetInfo(){
        System.out.println("处理过程中发生异常");
        return "处理过程中发生异常！";
    }
}
