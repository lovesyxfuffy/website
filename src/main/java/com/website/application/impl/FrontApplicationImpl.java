package com.website.application.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.website.application.FrontApplication;
import com.website.controller.exceptions.BizException;
import com.website.dao.mappers.ArticleMapper;
import com.website.dao.mappers.ConfigMapper;
import com.website.dao.po.Article;
import com.website.dao.po.ArticleExample;
import com.website.dao.po.Config;
import com.website.dao.po.ConfigExample;
import com.website.dto.PageDto;
import com.website.dto.PageResultDto;
import com.website.enums.ConfigConstants;
import com.website.enums.ConfigModelConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
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
    public Map<String, List<String>> getMainPageConfig() {
        ConfigExample configExample = new ConfigExample();
        configExample.createCriteria().andConfigmodelEqualTo(ConfigModelConstants.MAIN_PAGE);
        List<Config> configList = configMapper.selectByExample(configExample);
        Map<String, List<String>> configMap = new HashMap<>();
        for (Config config : configList) {
            List<String> tmp = configMap.computeIfAbsent(config.getConfigname(), k -> new ArrayList<>());
            tmp.add(config.getConfigcontent());
        }
        return configMap;
    }


    @Override
    public PageResultDto getArticleList(PageDto pageDto) {
        if (pageDto.getPageNum() != null)
            PageHelper.startPage(pageDto.getPageNum(), pageDto.getPageSize());
        ArticleExample articleExample = new ArticleExample();
        articleExample.createCriteria().andTypeEqualTo(pageDto.getModel());
        articleExample.setOrderByClause(" time desc ");
        List<Article> body = articleMapper.selectByExample(articleExample);
        PageInfo<Article> pageInfo = new PageInfo<>(body);
        PageResultDto pageResultDto = new PageResultDto();
        pageResultDto.setBody(body);
        pageResultDto.setPage(pageDto);
        pageDto.setTotal(pageInfo.getTotal());
        return pageResultDto;
    }

    @Override
    public Article getArticleById(Integer articleId) {
        return articleMapper.selectByPrimaryKey(articleId);
    }

    @Override
    public Article getArticleByType(String articleType) {
        ArticleExample articleExample = new ArticleExample();
        articleExample.createCriteria().andTypeEqualTo(articleType);
        articleExample.setOrderByClause(" time desc ");
        List<Article> result = articleMapper.selectByExampleWithBLOBs(articleExample);
        if (CollectionUtils.isEmpty(result))
            return null;
        return result.get(0);
    }

    @Override
    public List<String> getHeadImgList() {
        ConfigExample configExample = new ConfigExample();
        configExample.createCriteria().andConfigmodelEqualTo(ConfigModelConstants.MAIN_PAGE).andConfignameEqualTo(ConfigConstants.HEAD_IMG);
        List<Config> result = configMapper.selectByExample(configExample);
        return result.stream().map(Config::getConfigcontent).collect(Collectors.toList());
    }


}
