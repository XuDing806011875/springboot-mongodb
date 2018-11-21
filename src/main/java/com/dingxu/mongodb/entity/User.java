package com.dingxu.mongodb.entity;

import lombok.Data;

/**
 * @description: description
 * @author: dingxu
 * @create: 2018-11-21 10:06
 **/
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private Integer gender;
}
