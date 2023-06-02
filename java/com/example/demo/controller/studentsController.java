package com.example.demo.controller;

import com.example.demo.entity.students;
import com.example.demo.mapper.studentsmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * MyAppController 是一个示例控制器，处理 /app 路径下的请求。
 */
@RestController
@RequestMapping("/app")
public class studentsController {
    @Autowired
    private studentsmapper stumapper;

    @GetMapping("/findall")
    public List<students> gett(){
        List<students> List1=stumapper.findall();
        System.out.println(List1);
        return List1;

    }


}
