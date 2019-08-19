package com.example.plus.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.plus.entity.FUser;
import com.example.plus.mapper.FUserMapper;
import com.example.plus.service.IFUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FUserServiceImpl extends ServiceImpl<FUserMapper, FUser> implements IFUserService {
    @Resource
    private FUserMapper userMapper;
    @Override
    public List<FUser> getUserList() {
        return userMapper.selectList(null);
    }
}

