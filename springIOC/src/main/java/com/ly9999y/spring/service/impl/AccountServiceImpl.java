package com.ly9999y.spring.service.impl;

import com.ly9999y.spring.dao.IAccountDao;
import com.ly9999y.spring.dao.impl.AccountDaoImpl;
import com.ly9999y.spring.service.IAccountService;

import java.util.*;

public class AccountServiceImpl implements IAccountService {

	private String name;
	private Integer age;
	private Date birthday;

	private String[] myStrs;
	private List<String> myList;
	private Set<String> mySet;
	private Map<String,String> myMap;
	private Properties myProps;

	private IAccountDao accountDao = new AccountDaoImpl();//

	public AccountServiceImpl() {
	}

	public AccountServiceImpl(String name, Integer age, Date birthday) {
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}

	@Override
	public void saveAccount() {
//		accountDao.saveAccount();
		System.out.println(name+","+age+","+birthday);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String[] getMyStrs() {
		return myStrs;
	}

	public void setMyStrs(String[] myStrs) {
		this.myStrs = myStrs;
	}

	public List<String> getMyList() {
		return myList;
	}

	public void setMyList(List<String> myList) {
		this.myList = myList;
	}

	public Set<String> getMySet() {
		return mySet;
	}

	public void setMySet(Set<String> mySet) {
		this.mySet = mySet;
	}

	public Map<String, String> getMyMap() {
		return myMap;
	}

	public void setMyMap(Map<String, String> myMap) {
		this.myMap = myMap;
	}

	public Properties getMyProps() {
		return myProps;
	}

	public void setMyProps(Properties myProps) {
		this.myProps = myProps;
	}

	public IAccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(IAccountDao accountDao) {
		this.accountDao = accountDao;
	}
}
