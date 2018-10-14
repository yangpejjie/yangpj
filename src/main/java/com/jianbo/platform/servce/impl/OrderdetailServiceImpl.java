package com.jianbo.platform.servce.impl;

import com.jianbo.platform.entity.Orderdetail;
import com.jianbo.platform.dao.OrderdetailDao;
import com.jianbo.platform.servce.OrderdetailService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 订单详情 服务实现类
 */
@Service
public class OrderdetailServiceImpl extends ServiceImpl<OrderdetailDao, Orderdetail> implements OrderdetailService {
	
}
