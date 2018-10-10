package com.spring.learn.annotation;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class MyAppConfig {
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getBasicDataSource());
		
		return jdbcTemplate;
	}
	
	@Bean("dataSource")
	public BasicDataSource getBasicDataSource() {
		
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName("");
		basicDataSource.setUrl("");
		basicDataSource.setUsername("");
		basicDataSource.setPassword("");
		
		basicDataSource.setInitialSize(5);
		basicDataSource.setMaxTotal(10);
		
		return basicDataSource;
		
	}

}
