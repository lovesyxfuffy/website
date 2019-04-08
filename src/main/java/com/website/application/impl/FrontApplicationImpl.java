package com.website.application.impl;

import com.github.pagehelper.PageHelper;
import com.website.application.FrontApplication;
import com.website.dao.mappers.ArticleMapper;
import com.website.dao.mappers.ConfigMapper;
import com.website.dao.po.Article;
import com.website.dao.po.ArticleExample;
import com.website.dao.po.Config;
import com.website.dao.po.ConfigExample;
import com.website.dto.PageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by yujingyang on 2019/4/8.
 */
@Service
public class FrontApplicationImpl implements FrontApplication {

    @Autowired
    ConfigMapper configMapper;

    @Autowired
    ArticleMapper articleMapper;


    @Override
    public Map<String, String> getMainPageConfig() {
        ConfigExample configExample = new ConfigExample();
        configExample.createCriteria().andConfigmodelEqualTo(1);
        List<Config> configList = configMapper.selectByExample(configExample);
        return configList.stream().collect(Collectors.toMap(Config::getConfigname, Config::getConfigcontent));
    }


    @Override
    public List<Article> getArticleList(PageDto pageDto) {
        if (pageDto.getPageNum() != null)
            PageHelper.startPage(pageDto.getPageNum(), pageDto.getPageSize());
        ArticleExample articleExample = new ArticleExample();
        articleExample.createCriteria().andTypeEqualTo(pageDto.getModel());
        return articleMapper.selectByExample(articleExample);
    }


}
