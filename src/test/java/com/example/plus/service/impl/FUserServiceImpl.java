package com.example.plus.service.impl;

import com.example.plus.entity.FUser;
import com.example.plus.mapper.FUserMapper;
import com.example.plus.service.IFUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author jack
 * @since 2019-06-19
 */
@Service
public class FUserServiceImpl extends ServiceImpl<FUserMapper, FUser> implements IFUserService {
    @Resource
    private FUserMapper userMapper;
    @Override
    public List<FUser> getUserList() {
        return userMapper.selectList(null);
    }
}
