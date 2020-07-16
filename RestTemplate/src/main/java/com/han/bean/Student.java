package com.han.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor   //生成一个无参数构造方法
public class Student {
    private String name;
    private int age;
    private String sex;
}
