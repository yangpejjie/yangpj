package com.jianbo.platform.servce.impl;

import com.jianbo.platform.entity.Teacher;
import com.jianbo.platform.dao.TeacherDao;
import com.jianbo.platform.servce.TeacherService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 讲师信息基本表 服务实现类
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherDao, Teacher> implements TeacherService {
	
}
