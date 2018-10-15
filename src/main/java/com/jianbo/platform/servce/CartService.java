package com.jianbo.platform.servce;

import com.jianbo.platform.entity.Cart;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.service.IService;

/**
 * 购物车 服务类
 */
public interface CartService extends IService<Cart> {
	//获取购物车的所有信息
	public List<Cart> getAllCart();
	//获取单个购物车
	public Cart getCart();
	//插入一条新数据
	public int insert();
	
}
