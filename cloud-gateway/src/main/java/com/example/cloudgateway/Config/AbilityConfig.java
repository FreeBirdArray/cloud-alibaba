package com.example.cloudgateway.Config;

import com.example.cloudgateway.filter.AbilityGlobalFilter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.filter.reactive.HiddenHttpMethodFilter;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

/**
 * @Company 北京卡尔卡拉科技股份有限公司
 * @Author NorthernGhost
 * @Description
 * @Date 2021/3/3 14:26
 * @Version 1.0
 */
@Configuration
public class AbilityConfig {

    @Bean
    public AbilityGlobalFilter abilityGlobalFilter(){
        return new AbilityGlobalFilter();
    }


   /* @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("test_read_body", r -> r
                        .readBody(String.class, i -> !StringUtils.isEmpty(i))
                        .uri("http://localhost:8080"))
                .build();
    }*/

/*    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("test_modify_body", r -> r
                        .path("/test/**")
                        .filters(f ->
                                f.modifyRequestBody(String.class, String.class, ((exchange, s) -> {
                                    return Mono.just(s);
                                }))
                                        .uri("http://localhost:8080"))
                        .build();
    }*/
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("test_modify_body", r -> r
                        .path("/config/**")
                        .filters(f ->f.modifyRequestBody(String.class, String.class,((exchange, s) -> {
                            return Mono.just(s);
                        })))
                        .uri("lb://cloud-provider"))
                        .build();
    }


}
