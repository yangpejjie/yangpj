package com.jianbo.platform.servce.impl;

import com.jianbo.platform.entity.Discussion;
import com.jianbo.platform.dao.DiscussionDao;
import com.jianbo.platform.servce.DiscussionService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 大众讨论 服务实现类
 */
@Service
public class DiscussionServiceImpl extends ServiceImpl<DiscussionDao, Discussion> implements DiscussionService {
	
}
