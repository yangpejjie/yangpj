package com.jianbo.platform.servce.impl;

import com.jianbo.platform.entity.User;
import com.jianbo.platform.dao.UserDao;
import com.jianbo.platform.servce.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 用户信息基本表 服务实现类
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
	
}
