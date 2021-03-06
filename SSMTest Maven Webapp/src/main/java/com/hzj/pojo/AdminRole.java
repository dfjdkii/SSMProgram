package com.hzj.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class AdminRole implements Serializable {
    private Integer roleid;

    private String rolename;

    private Date createtime;
    
    private List<AdminPermission> Permissions;

    private static final long serialVersionUID = 1L;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

	public List<AdminPermission> getPermissions() {
		return Permissions;
	}

	public void setPermissions(List<AdminPermission> permissions) {
		Permissions = permissions;
	}
    
}