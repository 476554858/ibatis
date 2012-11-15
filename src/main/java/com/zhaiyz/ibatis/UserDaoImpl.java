package com.zhaiyz.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class UserDaoImpl extends SqlMapClientDaoSupport implements UserDao {

	@Override
	public int insert(User user) {
		return (Integer) getSqlMapClientTemplate().insert(
				"com.zhaiyz.ibatis.insert", user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> select(User user) {
		return (List<User>) getSqlMapClientTemplate().queryForList(
				"com.zhaiyz.ibatis.select", user);
	}

	@Override
	public int delete(User user) {
		return getSqlMapClientTemplate().delete("com.zhaiyz.ibatis.delete",
				user);
	}

	@Override
	public int update(User user) {
		return getSqlMapClientTemplate().update("com.zhaiyz.ibatis.update", user);
	}

}
