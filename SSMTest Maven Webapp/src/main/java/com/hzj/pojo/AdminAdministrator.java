package com.hzj.pojo;

import java.io.Serializable;
import java.util.Date;

public class AdminAdministrator implements Serializable {
    private Integer adminid;

    private AdminRole adminRole;

    private String adminaccount;

    private String adminpassword;

    private String adminpasswordsalt;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

	public AdminRole getAdminRole() {
		return adminRole;
	}

	public void setAdminRole(AdminRole adminRole) {
		this.adminRole = adminRole;
	}

	public String getAdminaccount() {
        return adminaccount;
    }

    public void setAdminaccount(String adminaccount) {
        this.adminaccount = adminaccount == null ? null : adminaccount.trim();
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword == null ? null : adminpassword.trim();
    }

    public String getAdminpasswordsalt() {
        return adminpasswordsalt;
    }

    public void setAdminpasswordsalt(String adminpasswordsalt) {
        this.adminpasswordsalt = adminpasswordsalt == null ? null : adminpasswordsalt.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}