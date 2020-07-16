package com.han.feign;

import com.han.bean.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider")
public interface StudentFeign {
    @GetMapping("/findAll")
    Collection<Student> findAll();

    @GetMapping("/index")
    String index();
}
