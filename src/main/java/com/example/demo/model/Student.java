package com.example.demo.model;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Alias("Student")
@Data
public class Student {
    private String name;
}
