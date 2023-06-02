package com.example.demo.controller;

import com.example.demo.entity.library;
import com.example.demo.mapper.LibMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/app1")
public class LibController {
    @Autowired
    private LibMapper libmapper;

    @GetMapping("/findalll")
    public List<library> gett(){
        List<library> List1=libmapper.findalll();
        System.out.println(List1);
        return List1;

    }
}
