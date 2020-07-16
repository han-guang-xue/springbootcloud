package com.han.controller;

import com.han.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
public class StudentController {

    @Autowired
    private RestTemplate restTemplate;

    private final static String url = "Http://provider/";

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForEntity(url + "findAll", Collection.class).getBody();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return restTemplate.getForEntity(url + "findById/{id}",Student.class,id).getBody();
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.postForEntity(url + "save",student,null);
    }

    @PostMapping("/save2")
    public void save2(@RequestBody Student student){
        restTemplate.postForObject(url + "save",student,null);
    }


    @GetMapping("/index")
    public String index(){
        return restTemplate.getForEntity(url + "index", String.class).getBody();
    }
}
