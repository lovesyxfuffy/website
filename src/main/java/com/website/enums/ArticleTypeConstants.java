package com.website.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yujingyang on 2019/4/8.
 */
public class ArticleTypeConstants {

    public static final String PROJECT = "project";
    //notice:通知公告,information中标信息,news新闻中心,field业务领域,department分支机构,project精品项目
    //talent 人才战略 hiring招聘信息 education教育培训
    //profile公司简介 title公司资质 culture公司文化 speech 公司致辞
    public static final Map<String,String> ARTICLE_TYPE_MAPPING = new HashMap<>();

    static {
        ARTICLE_TYPE_MAPPING.put("project","精品项目");
        ARTICLE_TYPE_MAPPING.put("information","中标信息");
        ARTICLE_TYPE_MAPPING.put("news","新闻中心");
        ARTICLE_TYPE_MAPPING.put("field","业务领域");
        ARTICLE_TYPE_MAPPING.put("department","分支机构");
        ARTICLE_TYPE_MAPPING.put("talent","人才战略");
        ARTICLE_TYPE_MAPPING.put("hiring","招聘信息");
        ARTICLE_TYPE_MAPPING.put("education","教育培训");
        ARTICLE_TYPE_MAPPING.put("profile","公司简介");
        ARTICLE_TYPE_MAPPING.put("title","公司资质");
        ARTICLE_TYPE_MAPPING.put("culture","公司文化");
        ARTICLE_TYPE_MAPPING.put("speech","公司致辞");
    }
}
