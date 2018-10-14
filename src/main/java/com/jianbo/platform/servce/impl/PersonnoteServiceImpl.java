package com.jianbo.platform.servce.impl;

import com.jianbo.platform.entity.Personnote;
import com.jianbo.platform.dao.PersonnoteDao;
import com.jianbo.platform.servce.PersonnoteService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 我的笔记 服务实现类
 */
@Service
public class PersonnoteServiceImpl extends ServiceImpl<PersonnoteDao, Personnote> implements PersonnoteService {
	
}
