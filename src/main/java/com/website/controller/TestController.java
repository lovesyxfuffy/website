package com.website.controller;

import com.website.dao.mappers.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yujingyang on 2019/3/26.
 */
@RestController
public class TestController {
    @Autowired
    AccountMapper accountMapper;

    @GetMapping("/hello")
    public int Hello(){
        return accountMapper.selectId();
    }
}
