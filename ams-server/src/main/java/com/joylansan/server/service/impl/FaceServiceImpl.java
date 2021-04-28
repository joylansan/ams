package com.joylansan.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.joylansan.server.mapper.FaceMapper;
import com.joylansan.server.pojo.Face;
import com.joylansan.server.service.IFaceService;
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
public class FaceServiceImpl extends ServiceImpl<FaceMapper, Face> implements IFaceService {

}
