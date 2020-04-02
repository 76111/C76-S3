package com.yc.xm;



import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.yc.xm.dao.UserMapper;




@SpringBootTest
class XmApplicationTests {
	
	@Resource
	private UserMapper um;

	

	

	@Test
	void test1() {
		Assert.isTrue(um.selectByExample(null).size()>0,"结果集数量不正确!");
	}

}
