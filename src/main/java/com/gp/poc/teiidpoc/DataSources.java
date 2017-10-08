package com.gp.poc.teiidpoc;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSources {

	public DataSources() {
		// TODO Auto-generated constructor stub
	}
	@ConfigurationProperties(prefix="spring.datasource.teiiduserganesh")
	@Bean
	public DataSource teiiduserganesh() {
		return DataSourceBuilder.create().build();
	}

}
