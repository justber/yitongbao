package cn.hc.servicelogin.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DockerInfoVo {
    private String id; // 项目id


    private String title;  // 项目名称

    // 0.01
    private BigDecimal price; // 价格


    private String cover; //封面

    private String description; // 描述
}

