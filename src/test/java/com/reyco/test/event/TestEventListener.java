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

package com.reyco.test.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.reyco.test.domain.TestEvent;

/**
 * 
 * @author reyco
 * @since 5.0
 */
@Component
public class TestEventListener{
	
	@EventListener
	public void testEvent(TestEvent testEvent) {
		System.out.println(testEvent.getTestInfo());
	}

}
