package com.example.demo.controller;

import com.example.demo.config.ZuceInfo;
import com.example.demo.entity.library;
import com.example.demo.entity.loginDTO;
import com.example.demo.mapper.LoginMapper;

import com.example.demo.util.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.util.Result;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginMapper loginMapper;

    @PostMapping("/findall")
    public Result gett(@RequestBody loginDTO loginDTO) {
        System.out.println(loginDTO);
        loginDTO List1 = loginMapper.findlogin(loginDTO);
        System.out.println(List1);
        if (List1 != null) {
            String token = JwtUtils.createToken(List1);
            // 封装token和用户信息
            Map<String, Object> data = new HashMap<>();
            data.put("token", token);
            data.put("user", List1);
            // 返回成功结果
            return new Result(200, "", data);
        }
        return new Result(401, "用户不存在", "");

    }

    @PostMapping("/adduser")
    public String add(@RequestBody ZuceInfo zuceInfo) {
        List<ZuceInfo> list1 = loginMapper.findbyusername(zuceInfo);
        System.out.println(zuceInfo);

        if(list1.isEmpty()){
            loginMapper.addaccount(zuceInfo);
            loginMapper.addtenant(zuceInfo);
            return "成功注册！";
        }
        return "用户已存在";
    }
}
