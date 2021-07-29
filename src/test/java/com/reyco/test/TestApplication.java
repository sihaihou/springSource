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

package com.reyco.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.reyco.test.factoryBean.FactoryBeanBean;
import com.reyco.test.factoryBean.FactoryBeanClass;
import com.reyco.test.importConfig.ImportBean;

/**
 * 
 * @author reyco
 * @since 5.0
 */
@SuppressWarnings("all")
public class TestApplication {
	
	public static void main(String[] args) {
	    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
	    /*ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");*/
	    
		/*TestService testService = ac.getBean(TestService.class);
		String test = testService.test();
		System.out.println(test);*/
		
		//测试事件
		/*TestService testService = ac.getBean(TestService.class);
		testService.test();
		TestEvent testEvent = new TestEvent("test事件");
		ac.publishEvent(testEvent);*/
	    
	    //测试自定义scope
	    /*for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i1 = 0; i1 < 2; i1++) {
                        System.out.println(Thread.currentThread().getId() + "-->" + ac.getBean("customScopeBean"));
                    }
                }
            }).start();
        }*/
	    
	    //测试FactoryBean
	   /* FactoryBeanBean factoryBeanBean = ac.getBean("&factoryBeanBean",FactoryBeanBean.class);
	    FactoryBeanClass factoryBeanclass = ac.getBean("factoryBeanBean",FactoryBeanClass.class);
	    System.out.println(factoryBeanBean+":"+factoryBeanclass);*/
	    
	    //
	    ImportBean importBean = ac.getBean(ImportBean.class);
	    System.out.println("#######importBean:"+importBean);
	    importBean.test();
	    
	}
	
}
