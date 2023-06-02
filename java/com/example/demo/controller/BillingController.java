package com.example.demo.controller;

import com.example.demo.entity.billing;
import com.example.demo.mapper.BillingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/app2")
public class BillingController {
    @Autowired
    private BillingMapper billingmapper;
    @GetMapping("/findbilling")
    public List<billing> get(){
        List<billing> List3=billingmapper.findbilling();
        System.out.println(List3);
        return List3;

    }
}
