package com.example.demo.controller;
import com.example.demo.entity.landlord;
import com.example.demo.mapper.LordMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/app2")
public class LordController {

    @Autowired
    private LordMapper lordmapper;

    @GetMapping("/findlord")
    public List<landlord> get(){
        List<landlord> List2=lordmapper.findlord();
        System.out.println(List2);
        return List2;

    }
}
