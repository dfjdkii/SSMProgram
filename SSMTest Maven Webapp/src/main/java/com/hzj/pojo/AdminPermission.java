package com.hzj.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class AdminPermission implements Serializable {
    private Integer permissionid;

    private String permissionname;

    private Date createtime;

    private List<AdminRole> Roles;
    private static final long serialVersionUID = 1L;

    public Integer getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }

    public String getPermissionname() {
        return permissionname;
    }

    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname == null ? null : permissionname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

	public List<AdminRole> getRoles() {
		return Roles;
	}

	public void setRoles(List<AdminRole> roles) {
		Roles = roles;
	}
    
}