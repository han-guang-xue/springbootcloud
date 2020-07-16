package com.han.feign.feignImpl;

import com.han.bean.Student;
import com.han.feign.StudentFeign;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements StudentFeign {

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中...";
    }



}
