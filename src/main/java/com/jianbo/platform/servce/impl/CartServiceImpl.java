package com.jianbo.platform.servce.impl;

import com.jianbo.platform.entity.Cart;
import com.jianbo.platform.dao.CartDao;
import com.jianbo.platform.servce.CartService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 购物车 服务实现类
 */
@Service
public class CartServiceImpl extends ServiceImpl<CartDao, Cart> implements CartService {

	@Autowired
	private CartDao cartDao;
	
	@Override
	public List<Cart> getAllCart() {
		
		List<Cart> cartList = cartDao.selectList(null);
		
		return cartList;
	}
	
}
