package com.cd.test.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("请求参数test")
public class Test {

    @ApiModelProperty(value = "id",name = "id信息",required = true)
    private String id;

    @ApiModelProperty(value = "name",name = "name信息",required = true)
    private String name;
}
