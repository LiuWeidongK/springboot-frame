package com.springboot.frame;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liuweidong03 <liuweidong03@kuaishou.com>
 * Created on 2023/1/12
 */
@Slf4j
@Component
public class EndpointsListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
//
//        ApplicationContext context = event.getApplicationContext();
//        Map<RequestMappingInfo, HandlerMethod> methods =
//                context.getBean(RequestMappingHandlerMapping.class).getHandlerMethods();
//
//        methods.forEach((k, v) -> log.error("{} {}", k, v));
    }
}
