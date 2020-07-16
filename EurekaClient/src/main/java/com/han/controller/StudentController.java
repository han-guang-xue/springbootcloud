package com.han.controller;

import com.han.bean.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    @Value("${server.port}")
    private String Port;

    private static Map<Long, Student> studentMap = new HashMap();
    static {
        studentMap.put(1L,new Student("张三",18,"男"));
        studentMap.put(2L,new Student("李四",20,"女"));
        studentMap.put(3L,new Student("王五",19,"男"));
    }

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentMap.values();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return studentMap.get(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentMap.put(4L,student);
    }

    @GetMapping("/index")
    public String index(){
        return Port;
    }

}
