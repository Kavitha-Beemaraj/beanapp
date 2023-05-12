package com.kavitha.beanapp;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeanappApplication {

	public static void main(String[] args) {

		/*ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Vehicle obj = (Vehicle) context.getBean("car");
		obj.drive();*/

		Tyre t = new Tyre();
		System.out.println(t);

	}

}
