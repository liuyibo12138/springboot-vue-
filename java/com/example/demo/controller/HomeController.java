package com.example.demo.controller;
import com.example.demo.config.HomeInfoResult;
import com.example.demo.config.HomeaddInfo;
import com.example.demo.entity.home;
import com.example.demo.mapper.HomeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/app2")
public class HomeController {
    @Autowired
    private HomeMapper homemapper;

    @GetMapping("/findhome")
    public List<HomeInfoResult> get() {
        List<HomeInfoResult> List5 = homemapper.findhome();
        System.out.println(List5);
        return List5;

    }

    @PostMapping("/homeid")
    public List<HomeInfoResult> homesearch1(@RequestBody Integer info) {
        System.out.println(info);
        List<HomeInfoResult> List6 = homemapper.searchbyid(info);
        System.out.println(List6);
        return List6;
    }

    @PostMapping("/homeaddress")
    public List<HomeInfoResult> homesearch2(@RequestBody String info) {
        System.out.println(info);
        List<HomeInfoResult> List6 = homemapper.searchbyaddress(info);
        System.out.println(List6);
        return List6;
    }

    @PostMapping("/homesize")
    public List<HomeInfoResult> homesearch3(@RequestBody Integer info) {
        System.out.println(info);
        List<HomeInfoResult> List6 = homemapper.searchbysize(info);
        System.out.println(List6);
        return List6;
    }

    @PostMapping("/homeminprice")
    public List<HomeInfoResult> homesearch4(@RequestBody Integer info) {
        System.out.println(info);
        List<HomeInfoResult> List6 = homemapper.searchbyminprice(info);
        System.out.println(List6);
        return List6;
    }

    @PostMapping("/homemaxprice")
    public List<HomeInfoResult> homesearch5(@RequestBody Integer info) {
        System.out.println(info);
        List<HomeInfoResult> List6 = homemapper.searchbymaxprice(info);
        System.out.println(List6);
        return List6;

    }

    @PostMapping("/addhome")
        public String homesearch5(@RequestBody HomeaddInfo info) {
        System.out.println(info);
        homemapper.addhomeinfo(info);

        return "上传了";

    }
}
