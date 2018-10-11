package com.spring.learn.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext();
		ProductDAOImpl productDao = appContext.getBean(ProductDAOImpl.class);
		productDao.findById(1);
	}

}
