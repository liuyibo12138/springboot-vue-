package com.example.demo.controller;

import com.example.demo.entity.tenant;
import com.example.demo.mapper.TenantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/app2")
public class TenantController {
    @Autowired
    private TenantMapper tenantmapper;

    @GetMapping("/findtenant")
    public List<tenant> get(){
        List<tenant> List7=tenantmapper.findtenant();
        System.out.println(List7);
        return List7;

    }
}
