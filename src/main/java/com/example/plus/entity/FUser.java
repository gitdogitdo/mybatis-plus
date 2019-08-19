package com.example.plus.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.*;

import java.io.Serializable;

@TableName("f_user")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 手机号
     */
    private String telephone;
    /**
     * 邮箱
     */
    @TableField("e_mail")
    private String eMail;
    /**
     * 密码盐
     */
    private String salt;
    /**
     * 用户状态 0:正常,1:锁定
     */
    private Integer status;
    /**
     * 上一次登录的ip地址
     */
    @TableField("last_login_ip")
    private String lastLoginIp;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;
    /**
     * 修改时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;
    /**
     * 当前节点hash	
     */
    @TableField("point_hash")
    private String pointHash;
    /**
     * 剩余空间
     */
    private BigDecimal space;
    /**
     * 上传文件数量
     */
    @TableField("upload_file_num")
    private Integer uploadFileNum;
    /**
     * 下载文件数量
     */
    @TableField("download_file_num")
    private Integer downloadFileNum;
    /**
     * 使用状态:0使用,1不使用
     */
    @TableField("use_status")
    private Integer useStatus;
    /**
     * 出生日期
     */
    private LocalDateTime birthday;
    /**
     * 所在地
     */
    private String address;
    /**
     * 头像地址
     */
    private String avatar;

}
