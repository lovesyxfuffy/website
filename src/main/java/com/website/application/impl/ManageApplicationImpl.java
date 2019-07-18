package com.website.application.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.website.application.ManageApplication;
import com.website.controller.exceptions.BizException;
import com.website.dao.mappers.AccountMapper;
import com.website.dao.mappers.ArticleMapper;
import com.website.dao.mappers.ConfigMapper;
import com.website.dao.po.*;
import com.website.dto.PageDto;
import com.website.dto.PageResultDto;
import com.website.enums.ArticleTypeConstants;
import com.website.enums.ConfigConstants;
import com.website.enums.ConfigModelConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by yujingyang on 2019/4/9.
 */
@Service
public class ManageApplicationImpl implements ManageApplication {

    @Autowired
    AccountMapper accountMapper;

    @Autowired
    ConfigMapper configMapper;

    @Autowired
    ArticleMapper articleMapper;

    @Value("${local.savePath}")
    String savePath;

    @Override
    public boolean checkUser(String userId, String password) {
        AccountExample accountExample = new AccountExample();
        accountExample.createCriteria().andUsernameEqualTo(userId).andPasswordEqualTo(password);
        List<Account> accountResult = accountMapper.selectByExample(accountExample);
        return !CollectionUtils.isEmpty(accountResult);
    }

    @Override
    public String saveFile(CommonsMultipartFile file) {
        Properties properties = new Properties();
        if (file == null || file.getSize() == 0) {
            return null;
        }
        String saveName = UUID.randomUUID() + file.getOriginalFilename();
        String saveFile = savePath + saveName;
        try {
            if ("".equals(file.getOriginalFilename()))
                return null;
            File newFile = new File(saveFile);

            file.transferTo(newFile);
            File afterFile = new File(saveFile);
            while (!afterFile.exists()) {
                Thread.sleep(100);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new BizException("读取配置文件错误");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return saveName;
    }

    @Override
    public void setConfig(Map<String, String> configs) {
        configs.forEach((key, value) -> {
            ConfigExample configExample = new ConfigExample();
            configExample.createCriteria().andConfignameEqualTo(key).andConfigmodelEqualTo(ConfigModelConstants.MAIN_PAGE);
            configMapper.deleteByExample(configExample);

            Config config = new Config();
            config.setConfigname(key);
            config.setConfigcontent(value);
            config.setConfigmodel(ConfigModelConstants.MAIN_PAGE);
            configMapper.insertSelective(config);
        });
    }

    @Override
    public void setImgs(List<String> headImgLinks) {
        ConfigExample configExample = new ConfigExample();
        configExample.createCriteria().andConfigmodelEqualTo(ConfigModelConstants.MAIN_PAGE)
                .andConfignameEqualTo(ConfigConstants.HEAD_IMG);
        configMapper.deleteByExample(configExample);
        for (String headImgLink : headImgLinks) {
            Config config = new Config();
            config.setConfigname(ConfigConstants.HEAD_IMG);
            config.setConfigcontent(headImgLink);
            config.setConfigmodel(ConfigModelConstants.MAIN_PAGE);
            configMapper.insertSelective(config);
        }
    }


    @Override
    public void updateArticle(Article article) {
        if(article.getTime() == null){
            article.setTime(new Date());
        }
        if (article.getId() != null) {
            articleMapper.updateByPrimaryKeySelective(article);
        } else {
            articleMapper.insertSelective(article);
        }
    }


    @Override
    public PageResultDto getArticleList(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPageNum(), pageDto.getPageSize());
        ArticleExample articleExample = new ArticleExample();
        if (!StringUtils.isEmpty(pageDto.getModel()))
            articleExample.createCriteria().andTypeEqualTo(pageDto.getModel());
        List<Article> result = articleMapper.selectByExample(articleExample);
        PageInfo<Article> pageInfo = new PageInfo<>(result);
        pageDto.setTotal(pageInfo.getTotal());
        PageResultDto pageResultDto = new PageResultDto();
        pageResultDto.setPage(pageDto);
        result = result.stream().map(row -> {
            row.setType(ArticleTypeConstants.ARTICLE_TYPE_MAPPING.get(row.getType()));
            return row;
        }).collect(Collectors.toList());
        pageResultDto.setBody(result);
        return pageResultDto;
    }

    @Override
    public void deleteArticle(Integer id) {
        articleMapper.deleteByPrimaryKey(id);
    }

}
