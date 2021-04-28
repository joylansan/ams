package com.joylansan.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.joylansan.server.pojo.RespBean;
import com.joylansan.server.pojo.User;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author joylansan
 * @since 2021-04-27
 */
public interface IUserService extends IService<User> {
    /**
     * 登录之后返回token
     * @param username
     * @param password
     * @param request
     * @return
     */
    RespBean login(String username, String password, HttpServletRequest request);

    /**
     * 根据用户名获取用户对象
     * @param username
     * @return
     */
    User getUserByUsername(String username);
}
