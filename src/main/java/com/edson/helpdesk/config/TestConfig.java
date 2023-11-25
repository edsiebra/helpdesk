package com.edson.helpdesk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.edson.helpdesk.services.DBService;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired // o Autowired é igual a new DBService
	private DBService dbService;
	
	@Bean
	public void instanciaDB() {
		this.dbService.instanciaDB();
	}
}
