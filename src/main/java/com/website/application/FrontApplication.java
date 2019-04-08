package com.website.application;

import com.website.dao.po.Article;
import com.website.dto.PageDto;

import java.util.List;
import java.util.Map;

/**
 * Created by yujingyang on 2019/4/8.
 */
public interface FrontApplication {
    Map<String, String> getMainPageConfig();

    List<Article> getArticleList( PageDto pageDto);
}
