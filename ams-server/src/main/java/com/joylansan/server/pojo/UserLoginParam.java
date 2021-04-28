package com.joylansan.server.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "UserLogin对象",description = "存储登录对象")
public class UserLoginParam {
    @ApiModelProperty(value = "账号",required = true)
    private String username;
    @ApiModelProperty(value = "密码",required = true)
    private String password;
}
