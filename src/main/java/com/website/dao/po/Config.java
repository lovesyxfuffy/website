package com.website.dao.po;

public class Config {
    private Integer id;

    private String configname;

    private String configcontent;

    private String configtype;

    private Integer configmodel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConfigname() {
        return configname;
    }

    public void setConfigname(String configname) {
        this.configname = configname == null ? null : configname.trim();
    }

    public String getConfigcontent() {
        return configcontent;
    }

    public void setConfigcontent(String configcontent) {
        this.configcontent = configcontent == null ? null : configcontent.trim();
    }

    public String getConfigtype() {
        return configtype;
    }

    public void setConfigtype(String configtype) {
        this.configtype = configtype == null ? null : configtype.trim();
    }

    public Integer getConfigmodel() {
        return configmodel;
    }

    public void setConfigmodel(Integer configmodel) {
        this.configmodel = configmodel;
    }
}