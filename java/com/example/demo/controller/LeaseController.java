package com.example.demo.controller;

import com.example.demo.config.LeaseDelete;
import com.example.demo.config.LeaseHome;
import com.example.demo.entity.lease;
import com.example.demo.mapper.LeaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/app2")
public class LeaseController {
    @Autowired
    private LeaseMapper leasemapper;

    @GetMapping("/findlease")
    public List<lease> get(){
        List<lease> List6=leasemapper.findlease();
        System.out.println(List6);
        return List6;
    }

    @PostMapping("/zufang")
    public String zufang(@RequestBody LeaseHome zufang){
        System.out.println(zufang);
        System.out.println("租房成功!");
        leasemapper.addlease(zufang);
        return "租房成功!";
    }

    @GetMapping("/allleaseinfo")
    public List<LeaseHome> getallleaseinfo(){
        List<LeaseHome> list = leasemapper.findalllease();
        System.out.println(list);
        return list;
    }

    @PostMapping("/deletelease")
    public String deletelease(@RequestBody LeaseDelete info){
        System.out.println(info);
        leasemapper.deletelease(info);
        System.out.println("删除租房成功!");
        return "删除租房成功!";
    }

}
