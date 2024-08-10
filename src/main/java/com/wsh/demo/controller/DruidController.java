package com.wsh.demo.controller;

import com.wsh.demo.config.DruidConfigDemo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

//@Controller
@RestController
@RequestMapping("druid")
public class DruidController {

    @Resource
    private DruidConfigDemo druidConfigDemo;


    @GetMapping("/list")
    public Map<String, Object> getMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("driverClassName", druidConfigDemo.getDriverClassName());
        map.put("url", druidConfigDemo.getUrl());
        map.put("username", druidConfigDemo.getUsername());
        map.put("password", druidConfigDemo.getPassword());
        return map;
    }
}
