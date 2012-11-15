package com.zhaiyz.ibatis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService rs = ac.getBean("userService", UserService.class);
		// 添加
		User user = new User();
		user.setSex(1);
		user.setName("zhaiyz123");
		user.setDegree(0.01d);
		System.out.println(rs.insert(user));
		
		// 删除
		System.out.println(rs.delete(user));
		
		// 修改
		user.setId(1);
		System.out.println(rs.update(user));
		
		// 查询
		System.out.println(rs.select(user));
	}

}
