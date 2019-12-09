package com.ly9999y.spring.dao.impl;

import com.ly9999y.spring.dao.IAccountDao;

public class AccountDaoImpl implements IAccountDao {
	@Override
	public void saveAccount() {
		System.out.println("保存了账户");
	}
}
