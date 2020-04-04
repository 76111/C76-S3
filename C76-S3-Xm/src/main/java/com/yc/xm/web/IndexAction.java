package com.yc.xm.web;


import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.xm.bean.User;
import com.yc.xm.biz.BizException;
import com.yc.xm.biz.UserBiz;
import com.yc.xm.dao.UserMapper;
import com.yc.xm.vo.Result;





@Controller
public class IndexAction {
	@Resource
	private UserBiz ubiz;
	@Resource
	private UserMapper um;

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
	@PostMapping("login")
	@ResponseBody
	public Result login(@Valid User user, Errors errors, HttpSession session) {
		if (errors.hasFieldErrors("username") || errors.hasFieldErrors("password")) {
			return new Result(1, "请输入用户名和密码");
		}

		try {
			User dbuser = ubiz.login(user);
			session.setAttribute("loginedUser", dbuser);
			return new Result(0, "登入成功", dbuser);
		} catch (BizException e) {
			e.printStackTrace();
			return new Result(e.getCode(), e.getMessage());
		}
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
