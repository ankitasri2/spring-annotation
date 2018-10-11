package com.spring.learn.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl implements IProductDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	private static final String insertQuery = "insert into bank_employee.product(id, name, price, description, quantity) values(?, ?, ?, ?)";
	private static final String selectQuery = "select * from bank_employee.product where id=1";
	
	//@Override
	public boolean add(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	//@Override
	public Product findById(int id) {
		Product product = jdbcTemplate.queryForObject(selectQuery, new ProductRowMapper());
		return null;
	}

}
