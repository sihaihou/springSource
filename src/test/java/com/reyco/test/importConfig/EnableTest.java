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

package com.reyco.test.importConfig;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

/**
 * 1,测试import导入一个普通类(会加载成bean)
 * 2,测试import导入一个配置类(ImportSelector搭配使用,selectImports返回的类全名数组会加载成bean)
 * 2,测试import导入一个注册类(ImportBeanDefinitionRegistrar搭配使用,注册的类beanDefinition会加载成bean)
 * @author reyco
 * @since 5.0
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
//@Import(ImportBean.class)
//@Import(ImportSelectorBean.class)
@Import(ImportRegisterBean.class)
public @interface EnableTest {
	
}
