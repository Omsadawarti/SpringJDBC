package com.SpringJDBC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

// Removing complete XML from the project, its convinient and fessible.
@Configuration
@ComponentScan(basePackages = {"com.SpringJDBC.dao,com.SpringJDBC.entities"})
public class JavaConfig {

	@Bean("dataSource")
	public DriverManagerDataSource getDataSouce()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUsername("root");
		dataSource.setPassword("Om/525325..??");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springJdbc");
		
		return dataSource;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate template  = new JdbcTemplate();
		template.setDataSource(getDataSouce());
		
		return template;
	}
}
