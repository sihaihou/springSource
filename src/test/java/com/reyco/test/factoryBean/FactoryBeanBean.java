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

package com.reyco.test.factoryBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;
/**
 * 测试FactoryBean
 * @author reyco
 * @since 5.0
 */
@Component
public class FactoryBeanBean implements FactoryBean<Object> {

	@Override
	public Object getObject() throws Exception {
		return new FactoryBeanClass();
	}
	@Override
	public Class<FactoryBeanClass> getObjectType() {
		return FactoryBeanClass.class;
	}
}
