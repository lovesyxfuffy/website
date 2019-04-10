package com.website.controller;

import com.website.application.FrontApplication;
import com.website.dto.PageDto;
import com.website.dto.Result;
import com.website.enums.ArticleTypeConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by yujingyang on 2019/4/8.
 */
@RestController
@RequestMapping("/front")
public class FrontController {

    @Autowired
    FrontApplication frontApplication;

    @RequestMapping(value = "/common/config", method = RequestMethod.POST)
    public Result getMainPageConfig() {
        return Result.builder().data(frontApplication.getMainPageConfig()).successTrue().build();
    }

    @RequestMapping(value = "/mainPage/getInformation", method = RequestMethod.POST)
    public Result getMainInfo(@RequestBody Map<String, Object> params) {
        Integer pageSize = (Integer) params.get("pageSize");
        String informationType = (String) params.get("informationType");
        PageDto pageDto = new PageDto();
        pageDto.setPageNum(1);
        pageDto.setPageSize(pageSize);
        pageDto.setModel(informationType);
        return Result.builder().data(frontApplication.getArticleList(pageDto).getBody()).successTrue().build();
    }

    @RequestMapping(value = "/mainPage/getExcellent", method = RequestMethod.POST)
    public Result getProjectList() {
        PageDto pageDto = new PageDto();
        pageDto.setModel(ArticleTypeConstants.PROJECT);
        return Result.builder().data(frontApplication.getArticleList(pageDto).getBody()).successTrue().build();
    }

    @RequestMapping(value = "/content/getArticleList", method = RequestMethod.POST)
    public Result getArticleList(@RequestBody PageDto pageDto) {
        return Result.builder().data(frontApplication.getArticleList(pageDto)).successTrue().build();
    }

    @RequestMapping(value = "/content/getArticleByModel/{modelType}", method = RequestMethod.POST)
    public Result getArticleByType(@PathVariable("modelType") String modelType) {
        return Result.builder().data(frontApplication.getArticleByType(modelType)).successTrue().build();
    }

    @RequestMapping(value = "/content/getArticleContent/{articleId}", method = RequestMethod.POST)
    public Result getArticleById(@PathVariable("articleId") Integer articleId) {
        return Result.builder().data(frontApplication.getArticleById(articleId)).successTrue().build();
    }

    @RequestMapping(value = "/common/getHeadImgs", method = RequestMethod.POST)
    public Result getHeadImgs() {
        return Result.builder().data(frontApplication.getHeadImgList()).successTrue().build();
    }

}
