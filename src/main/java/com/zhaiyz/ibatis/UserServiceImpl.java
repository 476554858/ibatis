package com.zhaiyz.ibatis;

import java.util.List;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public int insert(User user) {
		return userDao.insert(user);
	}

	@Override
	public List<User> select(User user) {
		return userDao.select(user);
	}

	@Override
	public int delete(User user) {
		return userDao.delete(user);
	}

	@Override
	public int update(User user) {
		return userDao.update(user);
	}

}
