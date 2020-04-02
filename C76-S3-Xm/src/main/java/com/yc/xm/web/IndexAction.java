package com.yc.xm.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class IndexAction {
	
	
	/**
	 * 首页
	 * @return
	 */
	@GetMapping({ "/", "toindex", "index.html" })
	public String toreg() {
		return "index";
	}
	
	/**
	 * 登录
	 * @return
	 */
	@GetMapping("tologin")
	public String tologin() {
		return "login";
	}

	/**
	 * 注册
	 * @return
	 */
	@GetMapping("toregister")
	public String toregister() {
		return "register";
	}

	
	/**
	 * 关于
	 * @return
	 */
	@GetMapping("toabout")
	public String toabout() {
		return "about";
	}
	
	@GetMapping("toliebiao")
	public String toliebaio() {
		return "liebiao";
	}
	/**
	 * 购物车
	 * @return
	 */
	@GetMapping("tocheckout")
	public String tocheckout() {
		return "checkout";
	}
	@GetMapping("toorder")
	public String toorder() {
		return "order";
	}
	
	@GetMapping("toselfInfo")
	public String toselfInfo() {
		return "selfInfo";
	}
}
