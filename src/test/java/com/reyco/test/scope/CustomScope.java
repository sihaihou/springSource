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

package com.reyco.test.scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

/**
 * 自定义scope
 * @author reyco
 * @since 5.0
 */

public class CustomScope implements Scope {

	private ThreadLocal<Object> threadLocalScope = new ThreadLocal<>();

	@Override
	public Object get(String name, ObjectFactory<?> objectFactory) {
		if (threadLocalScope.get() != null) {
			return threadLocalScope.get();
		}else {
			// 这个方法就是掉createbean方法获得一个实例
			Object object = objectFactory.getObject();
			threadLocalScope.set(object);
			return object;
		}
	}

	@Override
	public Object remove(String name) {
		return null;
	}

	@Override
	public void registerDestructionCallback(String name, Runnable callback) {
	}

	@Override
	public Object resolveContextualObject(String key) {
		return null;
	}

	@Override
	public String getConversationId() {
		return null;
	}

}
