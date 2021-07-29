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

package com.reyco.test.domain;

import java.io.Serializable;

/**
 * 
 * @author reyco
 * @since 5.0
 */
public class TestEvent implements Serializable{
	private String testInfo;

	/**
	 * @param testInfo
	 */
	public TestEvent(String testInfo) {
		super();
		this.testInfo = testInfo;
	}
	public String getTestInfo() {
		return testInfo;
	}
	public void setTestInfo(String testInfo) {
		this.testInfo = testInfo;
	}
}
