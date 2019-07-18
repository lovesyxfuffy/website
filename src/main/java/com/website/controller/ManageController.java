package com.website.controller;

import com.website.application.ManageApplication;
import com.website.dao.po.Article;
import com.website.dto.PageDto;
import com.website.dto.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by yujingyang on 2019/4/9.
 */
@RestController
@RequestMapping("/manage")
public class ManageController {

    @Autowired
    ManageApplication manageApplication;

    @RequestMapping(value = "/account/login", method = RequestMethod.POST)
    public Result login(@RequestBody Map<String, String> loginParam, HttpServletRequest request) {
        if (manageApplication.checkUser(loginParam.get("userName"), loginParam.get("password"))) {
            HttpSession session = request.getSession();
            session.setAttribute("loginFlag", true);
            return Result.builder().data("").successTrue().build();
        }
        return Result.builder().data(Result.FORBIDDEN, "账号或密码错误").failedFalse("账号或密码错误").build();
    }


    private final static String staticFilePath = "/static/";

    @RequestMapping(value = {"/article/img/upload", "/img/upload"}, method = RequestMethod.POST)
    @ResponseBody
    public String fileUpload(@RequestParam("file") CommonsMultipartFile file) {
        String fileName = manageApplication.saveFile(file);
        return staticFilePath + fileName;
    }

    @RequestMapping(value = "/info/setting", method = RequestMethod.POST)
    public Result setConfigInfo(@RequestBody Map<String, String> params) {
        manageApplication.setConfig(params);
        return Result.builder().data("").successTrue().build();
    }

    @RequestMapping(value = "/article/upload", method = RequestMethod.POST)
    public Result uploadArticle(@RequestBody Article article) {
        manageApplication.updateArticle(article);
        return Result.builder().data("").successTrue().build();
    }

    @RequestMapping(value = "/carsouleImg/upload", method = RequestMethod.POST)
    public Result setImgs(@RequestBody List<String> params) {
        manageApplication.setImgs(params);
        return Result.builder().data("").successTrue().build();
    }

    @RequestMapping(value = "/article/list", method = RequestMethod.POST)
    public Result getArticleList(@RequestBody PageDto pageDto) {
        return Result.builder().data(manageApplication.getArticleList(pageDto)).successTrue().build();
    }

    @RequestMapping(value = "/article/delete/{articleId}", method = RequestMethod.POST)
    public Result deleteArticle(@PathVariable("articleId") Integer articleId) {
        manageApplication.deleteArticle(articleId);
        return Result.builder().data("").successTrue().build();
    }

}
