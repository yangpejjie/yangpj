package com.jianbo.platform.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jianbo.platform.entity.Cart;
import com.jianbo.platform.servce.impl.CartServiceImpl;

/**
 * 购物车 前端控制器
 */
@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	private CartServiceImpl cartService;
	
	@RequestMapping("/test")
	public Object getString() {
		
		List<Cart> list = cartService.getAllCart();
		
		return list;
	}
}
