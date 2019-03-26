package com.website.dao.po;

public class Article {
    private Integer id;

    private String articlename;

    private Integer articletype;

    private String articlecreater;

    private String articlecontent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticlename() {
        return articlename;
    }

    public void setArticlename(String articlename) {
        this.articlename = articlename == null ? null : articlename.trim();
    }

    public Integer getArticletype() {
        return articletype;
    }

    public void setArticletype(Integer articletype) {
        this.articletype = articletype;
    }

    public String getArticlecreater() {
        return articlecreater;
    }

    public void setArticlecreater(String articlecreater) {
        this.articlecreater = articlecreater == null ? null : articlecreater.trim();
    }

    public String getArticlecontent() {
        return articlecontent;
    }

    public void setArticlecontent(String articlecontent) {
        this.articlecontent = articlecontent == null ? null : articlecontent.trim();
    }
}