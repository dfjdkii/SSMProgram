package com.hzj.pojo;

import java.io.Serializable;

public class AdminRoleandpermission implements Serializable {
    private Integer roleid;

    private Integer permissionid;

    private static final long serialVersionUID = 1L;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }
}