/*
 * Copyright 2002-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.reyco.test.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reyco.test.domain.User;
import com.reyco.test.service.UserService;
/**
 * 测试bean的初始化过程----bean的生命周期
 * @author hsh
 * @since 5.0
 */
@Service
public class UserServiceImpl implements UserService,InitializingBean,DisposableBean,BeanNameAware{
	
	String beanName;
	
	/**
	 * 测试属性上加@Autowired注解依赖注入
	 */
	@Autowired
	private AutowoiredBean autowoiredBean;
	
	@Resource
	private AutowoiredBean autowoiredBean2;
	
	
	private ConstructorArgsBean constructorArgsBean;
	
	@Override
	public User get() {
		User user = new User();
		user.setUsername("reyco");
		user.setPassword("123456");
		return user;
	}
	/**
	 * 测试构造方法上加@Autowired注解创建bean对象依赖注入
	 * @param constructorArgsBean
	 */
	@Autowired
	public UserServiceImpl(ConstructorArgsBean constructorArgsBean) {
		this.constructorArgsBean = constructorArgsBean;
		System.out.println("实例化UserServiceImpl");
	}
	/**
	 * 测试实现InitializingBean接口初始化bean
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean");
	}
	
	/**
	 * 测试方法上加@PostConstruct注解初始化bean
	 */
	@PostConstruct
	public void postConstruct() {
		System.out.println("PostConstruct");
	}
	/**
	 * 测试方法上加@PreDestroy注解注册销毁bean
	 */
	@PreDestroy
	public void preDestroy() {
		System.out.println("PreDestroy");
	}
	/**
	 * 测试方法上加@Autowired注解始化bean
	 */
	@Autowired
	public void Autowired() {
		System.out.println("Autowired");
	}
	/**
	 * 测试实现DisposableBean接口注册销毁bean
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
	}
	/**
	 * 测试实现BeanNameAware接口设置bean名称
	 */
	@Override
	public void setBeanName(String name) {
		System.out.println("beanNameAware");
		this.beanName=name;
	}
}
