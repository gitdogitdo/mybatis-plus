package com.example.plus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jack
 * @since 2019-08-19
 */
@TableName("user_0")
public class User0 implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private Integer age;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User0{" +
        ", id=" + id +
        ", name=" + name +
        ", age=" + age +
        "}";
    }
}
