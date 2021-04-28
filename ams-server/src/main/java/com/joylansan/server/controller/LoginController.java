package com.joylansan.server.controller;

import com.joylansan.server.pojo.User;
import com.joylansan.server.pojo.UserLoginParam;
import com.joylansan.server.pojo.RespBean;
import com.joylansan.server.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Api(tags = "LoginController")
@RestController
public class LoginController {

    @Autowired
    private IUserService userService;

    @ApiOperation(value = "登录之后返回token")
    @PostMapping("/login")
    public RespBean login(UserLoginParam userLoginParam, HttpServletRequest request){
        return userService.login(userLoginParam.getUsername(),userLoginParam.getPassword(),request);
    }

    @ApiOperation(value = "获取当前登录用户的信息")
    @GetMapping("/user/info")
    public User getUserInfo(Principal principal){
        if(null==principal){
            return null;
        }
        String username = principal.getName();
        User user = userService.getUserByUsername(username);
        user.setPassword(null);
        return user;
    }

    /**
     * 让前端删除请求头，而不是后端实现
     * @return
     */
    @ApiOperation(value = "退出登录")
    @PostMapping("/logout")
    public RespBean logout(){
        return RespBean.success("注销成功");
    }
}
