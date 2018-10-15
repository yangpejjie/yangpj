package com.jianbo.platform.servce.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jianbo.platform.dao.CartDao;
import com.jianbo.platform.entity.Cart;
import com.jianbo.platform.servce.CartService;

/**
 * 购物车 服务实现类
 */
@Service
public class CartServiceImpl extends ServiceImpl<CartDao, Cart> implements CartService {

	@Autowired
	private CartDao cartDao;
	
	@Autowired
	private Cart cart;
	
	@Override
	public Cart getCart() {
		
		Cart carMap = cartDao.selectById(1);
		
		
		
//		List<Cart> cartList = new ArrayList<Cart>();
//		cart.setId((long) 1); 
//		cart.setUserId("asdf");
//		cart.setCourseId("asdf");
//		cart.setIsDelte(1);
//		cart.setCreateTime(new Date());
//		cart.setModefyTime(new Date());
//		cartList.add(cart);
		
		System.out.println(">>>>>>>>>>>>"+carMap);
		return carMap;
	}

	@Override
	public List<Cart> getAllCart() {
		// TODO Auto-generated method stub
//		EntityWrapper<Cart> wrapper = new EntityWrapper<Cart>();
//		wrapper.eq("", params)
		List<Cart> list = cartDao.selectList(new EntityWrapper<Cart>().eq("isDelte", 0));
		
		return list;
	}

	@Override
	public int insert() {
		// TODO Auto-generated method stub
//		cart.setId((long) 1); 
		cart.setUserId("asdf");
		cart.setCourseId("asdf");
		cart.setIsDelte(1);
		cart.setCreateTime(new Date());
		cart.setModefyTime(new Date());
		
		int ret = cartDao.insert(cart);
		return ret;
	}
	
}
