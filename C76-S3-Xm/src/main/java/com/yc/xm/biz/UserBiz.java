package com.yc.xm.biz;

import java.util.List;


import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.yc.xm.bean.User;
import com.yc.xm.bean.UserExample;
import com.yc.xm.dao.UserMapper;


@Service
public class UserBiz {
	
	
	@Resource
	private UserMapper um;

	
	public User login(@Valid User user) throws BizException {
		UserExample ue=new UserExample();
		
		
		List<User> list=um.selectByExample(null);
	
		if(list.size()==0) {
			throw new BizException(103,"name","用户名或密码错误");
		}else if(list.size()>1) {
			throw new BizException(104,"name","存在多个相同 的账号信息,请跟换其他登入字段");
		}else {
			return list.get(0);
		}
	}
	

	
}
