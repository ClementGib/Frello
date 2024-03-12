package com.cdx.frello;

import animal.Animal;
import animal.Cat;
import animal.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class FrelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrelloApplication.class, args);
	}

}