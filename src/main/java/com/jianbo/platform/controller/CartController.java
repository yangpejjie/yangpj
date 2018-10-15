package com.jianbo.platform.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jianbo.platform.servce.CartService;

/**
 * 购物车 前端控制器
 */
@Controller
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@ResponseBody
	@RequestMapping("/test")
	public Object getString(Model model) {
		
//		Cart list = cartService.getCart();
//		List<Cart> list = cartService.getAllCart();
		int ret = cartService.insert();
		System.out.println(ret);
		return ret;
	}
}
