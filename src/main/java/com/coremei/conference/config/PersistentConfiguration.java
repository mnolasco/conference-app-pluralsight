package com.coremei.conference.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistentConfiguration {

//	@Bean
//	public DataSource dataSource() {
//		DataSourceBuilder<?> builder = DataSourceBuilder.create();
//		builder.url("jdbc:postgresql://localhost:5432/conference_app");
//		builder.username("postgres");
//		builder.password("admin");
//		
//		System.out.println("Custom datasource created...");
//		
//		return builder.build();
//
//	}
}
