package com.config.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//可以手动刷新配置
@RefreshScope
//${}中的配置都来源于配置中心
@RestController
@RequestMapping(value = "/client")
public class ConfigClientController {
    @Value("${welcome}")
    private String welcome;
    @Value("${env}")
    private String env;
    @Value("${user}")
    private String user;
    @RequestMapping(value = "/info")
    @ResponseBody
    public String info(){
        return "Hello "+user+", "+ welcome +" "+env;
    }
}
