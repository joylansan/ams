package com.joylansan.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.joylansan.server.mapper.LeaveMapper;
import com.joylansan.server.pojo.Leave;
import com.joylansan.server.service.ILeaveService;
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
public class LeaveServiceImpl extends ServiceImpl<LeaveMapper, Leave> implements ILeaveService {

}
