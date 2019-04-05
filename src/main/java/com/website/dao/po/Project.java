package com.website.dao.po;

public class Project {
    private Integer id;

    private String projectname;

    private String projectsubtitle;

    private String articlelink;

    private String projectimgurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getProjectsubtitle() {
        return projectsubtitle;
    }

    public void setProjectsubtitle(String projectsubtitle) {
        this.projectsubtitle = projectsubtitle == null ? null : projectsubtitle.trim();
    }

    public String getArticlelink() {
        return articlelink;
    }

    public void setArticlelink(String articlelink) {
        this.articlelink = articlelink == null ? null : articlelink.trim();
    }

    public String getProjectimgurl() {
        return projectimgurl;
    }

    public void setProjectimgurl(String projectimgurl) {
        this.projectimgurl = projectimgurl == null ? null : projectimgurl.trim();
    }
}