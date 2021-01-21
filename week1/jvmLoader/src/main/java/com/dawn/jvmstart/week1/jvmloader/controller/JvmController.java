package com.dawn.jvmstart.week1.jvmloader.controller;


import com.dawn.jvmstart.week1.jvmloader.model.BaseModel;
import com.dawn.jvmstart.week1.jvmloader.service.JvmBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "jvm")
public class JvmController {

    @Autowired
    private JvmBaseService jvmBaseService;

    @GetMapping(value = "hello")
    public String hello(){
        return "hello";
    }

    @GetMapping(value = "hello")
    public BaseModel findById(String id){
        return jvmBaseService.findById(id);
    }

}

