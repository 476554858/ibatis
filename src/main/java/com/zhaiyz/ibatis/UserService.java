package com.zhaiyz.ibatis;

import java.util.List;

public interface UserService {

	int insert(User user);

	List<User> select(User user);

	int delete(User user);

	int update(User user);
}
