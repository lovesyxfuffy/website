package com.website.dao.po;

public class Department {
    private Integer id;

    private String departmentname;

    private String departmentcontent;

    private String departmentarticlelink;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname == null ? null : departmentname.trim();
    }

    public String getDepartmentcontent() {
        return departmentcontent;
    }

    public void setDepartmentcontent(String departmentcontent) {
        this.departmentcontent = departmentcontent == null ? null : departmentcontent.trim();
    }

    public String getDepartmentarticlelink() {
        return departmentarticlelink;
    }

    public void setDepartmentarticlelink(String departmentarticlelink) {
        this.departmentarticlelink = departmentarticlelink == null ? null : departmentarticlelink.trim();
    }
}