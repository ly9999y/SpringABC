package com.ly9999y.spring.beanfactory;

import com.ly9999y.spring.service.IAccountService;
import com.ly9999y.spring.service.impl.AccountServiceImpl;

public class StaticFactory {
	public static IAccountService createAccountService() {
		return new AccountServiceImpl();
	}
}
