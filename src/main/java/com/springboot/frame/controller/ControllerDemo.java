package com.springboot.frame.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.Data;

/**
 * @author liuweidong03 <liuweidong03@kuaishou.com>
 * Created on 2023/1/12
 */
@OpenAPIDefinition()
@RestController // @RestController = @Controller + @ResponseBody
@RequestMapping("/demo")
public class ControllerDemo {

    @GetMapping("/get")
    public String getCall(@RequestParam String request) {
        return "Get ok: " + request;
    }

    @PostMapping("/post")
    public String postCall(@RequestBody Map<String, Object> request) {
        return "Post ok: " + JSON.toJSONString(request);
    }

    @PostMapping("/post/body")
    public String postCall(@RequestBody PostBody request) {
        return "Post ok: " + JSON.toJSONString(request);
    }

    @DeleteMapping("/delete")
    public String deleteCall() {
        return "Delete ok!";
    }

    @Data
    public static class PostBody {

        private String requestString;
        private Integer requestInteger;
    }
}
