package com.jianbo.platform.servce.impl;

import com.jianbo.platform.entity.Course;
import com.jianbo.platform.dao.CourseDao;
import com.jianbo.platform.servce.CourseService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 课程信息表 服务实现类
 */
@Service
public class CourseServiceImpl extends ServiceImpl<CourseDao, Course> implements CourseService {
	
}
