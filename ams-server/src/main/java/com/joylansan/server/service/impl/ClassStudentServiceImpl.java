package com.joylansan.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.joylansan.server.mapper.ClassStudentMapper;
import com.joylansan.server.pojo.ClassStudent;
import com.joylansan.server.service.IClassStudentService;
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
public class ClassStudentServiceImpl extends ServiceImpl<ClassStudentMapper, ClassStudent> implements IClassStudentService {

}
