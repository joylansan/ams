package com.joylansan.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.joylansan.server.mapper.MenuMapper;
import com.joylansan.server.pojo.Menu;
import com.joylansan.server.service.IMenuService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author joylansan
 * @since 2021-04-27
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
