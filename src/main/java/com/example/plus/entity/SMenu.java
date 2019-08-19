package com.example.plus.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 系统菜单表
 * </p>
 *
 * @author jack
 * @since 2019-07-10
 */
@TableName("s_menu")
public class SMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * uid
     */
    @TableId("u_id")
    private String uId;
    /**
     * 名称
     */
    private String name;
    /**
     * 父级ID
     */
    @TableField("parent_id")
    private String parentId;
    /**
     * 权限ID
     */
    @TableField("permission_id")
    private String permissionId;
    /**
     * 树编码
     */
    private String path;
    /**
     * 树编码
     */
    @TableField("sort_index")
    private BigDecimal sortIndex;
    /**
     * 备注
     */
    private String describe;
    /**
     * URL
     */
    private String url;
    /**
     * 图标
     */
    private String icon;
    /**
     * 状态
     */
    private BigDecimal status;


    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public BigDecimal getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(BigDecimal sortIndex) {
        this.sortIndex = sortIndex;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SMenu{" +
        ", uId=" + uId +
        ", name=" + name +
        ", parentId=" + parentId +
        ", permissionId=" + permissionId +
        ", path=" + path +
        ", sortIndex=" + sortIndex +
        ", describe=" + describe +
        ", url=" + url +
        ", icon=" + icon +
        ", status=" + status +
        "}";
    }
}
