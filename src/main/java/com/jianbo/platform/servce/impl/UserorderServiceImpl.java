package com.jianbo.platform.servce.impl;

import com.jianbo.platform.entity.Userorder;
import com.jianbo.platform.dao.UserorderDao;
import com.jianbo.platform.servce.UserorderService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 订单 服务实现类
 */
@Service
public class UserorderServiceImpl extends ServiceImpl<UserorderDao, Userorder> implements UserorderService {
	
}
