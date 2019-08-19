package com.example.plus.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.plus.entity.FUser;
import com.example.plus.service.IFUserService;
import com.example.plus.utils.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author jack
 * @since 2019-06-19
 */
@RestController
@RequestMapping("/fUser")
public class FUserController {

    @Autowired(required = true)
    private IFUserService ifUserService;

    @GetMapping("/getUserList")
    private ResponseMessage getUserList(){
       List<FUser> users =  ifUserService.getUserList();
       return ResponseMessage.ok().setData(users);
    }

    /**
     * 添加学生
     * @param user
     * @return
     */
    @PostMapping
    public ResponseMessage addStudent(@RequestBody FUser user){
        boolean flag = ifUserService.insert(user);
        return ResponseMessage.ok(flag);
    }

    /**
     * 删除学生
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseMessage deleteStudent(@PathVariable("id") Integer id){
        boolean rs = ifUserService.deleteById(id);
        return ResponseMessage.ok(rs);
    }

    /**
     * 修改学生
     * @param student
     * @return
     */
    @PutMapping
    public ResponseMessage updateStudent(@RequestBody FUser student){
        boolean rs = ifUserService.updateById(student);
        return ResponseMessage.ok(rs);
    }

    /**
     * 通过指定id查找学生
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResponseMessage getStudentById(@PathVariable("id") String id){
        FUser fUser = ifUserService.selectById(id);
        return ResponseMessage.ok(fUser);
    }


    /**
     * 通过指定条件查询学生
     * @param name
     * @return
     */
    @GetMapping("/name/{name}")
    public ResponseMessage getSudentByName(@PathVariable("name") String name){
        QueryWrapper<FUser> queryWrapper = new QueryWrapper<FUser>();
        queryWrapper.eq("name",name);
        List<FUser> rs = ifUserService.selectList(queryWrapper);
        return ResponseMessage.ok(rs);
    }
}

