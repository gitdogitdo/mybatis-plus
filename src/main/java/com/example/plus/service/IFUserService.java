package com.example.plus.service;

import com.example.plus.entity.FUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author jack
 * @since 2019-06-19
 */
public interface IFUserService extends IService<FUser> {

    List<FUser> getUserList();
}
