package com.cdx.frello;

import com.cdx.frello.user.Gender;
import com.cdx.frello.user.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class FrelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrelloApplication.class, args);
	}

}