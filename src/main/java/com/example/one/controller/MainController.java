package com.example.one.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @GetMapping("/hello")
    @ResponseBody
    public String insertQuest(@RequestParam String name) {
        return "Hello " + name;
    }


}
