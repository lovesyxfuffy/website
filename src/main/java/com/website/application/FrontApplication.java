package com.website.application;

import com.website.dao.po.Article;
import com.website.dto.PageDto;
import com.website.dto.PageResultDto;

import java.util.List;
import java.util.Map;

/**
 * Created by yujingyang on 2019/4/8.
 */
public interface FrontApplication {
    Map<String, List<String>> getMainPageConfig();

    PageResultDto getArticleList(PageDto pageDto);

    Article getArticleById(Integer articleId);

    Article getArticleByType(String articleType);

    List<String> getHeadImgList();
}
