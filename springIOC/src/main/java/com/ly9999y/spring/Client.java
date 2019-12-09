package com.ly9999y.spring;

import com.ly9999y.spring.dao.IAccountDao;
import com.ly9999y.spring.service.IAccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

		IAccountService accountService = (IAccountService)applicationContext.getBean("accountService");
		System.out.println(accountService);

		IAccountService accountServiceByFactory = (IAccountService)applicationContext.getBean("accountServiceByFactory");
		System.out.println(accountServiceByFactory);

		IAccountDao accountDao = (IAccountDao)applicationContext.getBean("accountDao");
		System.out.println(accountDao);
	}
}
