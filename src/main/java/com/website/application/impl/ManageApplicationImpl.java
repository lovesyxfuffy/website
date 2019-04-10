package com.website.application.impl;

import com.website.application.ManageApplication;
import com.website.controller.exceptions.BizException;
import com.website.dao.mappers.AccountMapper;
import com.website.dao.mappers.ArticleMapper;
import com.website.dao.mappers.ConfigMapper;
import com.website.dao.po.Account;
import com.website.dao.po.AccountExample;
import com.website.dao.po.Article;
import com.website.dao.po.Config;
import com.website.enums.ConfigConstants;
import com.website.enums.ConfigModelConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

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
        if (file == null || file.getSize() == 0)
            return null;
        try {
            String saveFile = savePath + file.getOriginalFilename();
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
        return file.getOriginalFilename();
    }

    @Override
    public void setConfig(Map<String, String> configs) {
        configs.forEach((key, value) -> {
            Config config = new Config();
            config.setConfigname(key);
            config.setConfigcontent(value);
            config.setConfigmodel(ConfigModelConstants.MAIN_PAGE);
            configMapper.insertSelective(config);
        });
    }

    @Override
    public void setImgs(List<String> headImgLinks) {
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
        if (article.getId() != null) {
            articleMapper.updateByPrimaryKeySelective(article);
        } else {
            articleMapper.insertSelective(article);
        }
    }

}
