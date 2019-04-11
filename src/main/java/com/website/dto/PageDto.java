package com.website.dto;

import lombok.Data;

/**
 * Created by yujingyang on 2019/4/8.
 */
@Data
public class PageDto {
    Integer pageNum;
    String model;
    Integer pageSize;
    Long total;
}
