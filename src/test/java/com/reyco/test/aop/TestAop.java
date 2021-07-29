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

package com.reyco.test.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Terry
 * @since 5.0
 */
@Aspect
@Component
public class TestAop {
	
	@Pointcut("execution(public * com.reyco.test.service.impl.*.*(..))")
    public void testPointCat(){}
	
	@Before("testPointCat()")
	public void before(JoinPoint joinPoint) throws Throwable {
		System.out.println("【前置通知】");
	}
	@After("testPointCat()")
	public void after(JoinPoint joinPoint) throws Throwable {
		System.out.println("【后置通知】");
	}
	@Around("testPointCat()")
	public void around(JoinPoint joinPoint) throws Throwable {
		System.out.println("【环绕通知】");
	}
	@AfterReturning("testPointCat()")
	public void afterReturning(JoinPoint joinPoint) throws Throwable {
		System.out.println("【返回通知】");
	}
	@AfterThrowing("testPointCat()")
	public void afterThrowing(JoinPoint joinPoint) throws Throwable {
		System.out.println("【异常通知】");
	}
}
