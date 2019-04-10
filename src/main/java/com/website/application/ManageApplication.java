package com.website.application;

import com.website.dao.po.Article;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.util.List;
import java.util.Map;

/**
 * Created by yujingyang on 2019/4/9.
 */
public interface ManageApplication {
    boolean checkUser(String userId, String password);

    String saveFile(CommonsMultipartFile file);

    void setConfig(Map<String, String> configs);

    void setImgs(List<String> headImgLinks);

    void updateArticle(Article article);
}
