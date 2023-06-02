package com.example.demo.controller;

import com.example.demo.entity.earning;
import com.example.demo.mapper.EarningMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.config.EarningInfoResult;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/app2")
public class EarningController {
    @Autowired
    private EarningMapper earningmapper;

    @GetMapping("/findearning")
    public List<EarningInfoResult> get(){
        List<EarningInfoResult> List4=earningmapper.findearning();
        System.out.println(List4);
        return List4;

    }
}
