package com.han.controller;

import com.han.bean.Student;
import com.han.feign.StudentFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/hystrix")
public class HystrixController {

    @Autowired
    private StudentFeign studentFeign;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentFeign.findAll();
    }

    @GetMapping("/index")
    public String index(){
        return studentFeign.index();
    }

}
