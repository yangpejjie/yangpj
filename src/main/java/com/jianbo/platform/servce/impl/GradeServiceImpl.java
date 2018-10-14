package com.jianbo.platform.servce.impl;

import com.jianbo.platform.entity.Grade;
import com.jianbo.platform.dao.GradeDao;
import com.jianbo.platform.servce.GradeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 打分 服务实现类
 */
@Service
public class GradeServiceImpl extends ServiceImpl<GradeDao, Grade> implements GradeService {
	
}
