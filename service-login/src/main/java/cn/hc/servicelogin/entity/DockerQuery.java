package cn.hc.servicelogin.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class DockerQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer sort;
    private Integer level;

    private String career;//注意，这里使用的是String类型，前端传过来的数据无需进行类型转换

    private String intro;
}