package com.spring.learn.annotation;

public interface IProductDAO {
	
	public boolean add(Product product);
	public Product findById(int id);

}
