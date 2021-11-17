package com.training.traininghibernateer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude= HibernateJpaAutoConfiguration.class)
public class TrainingHibernateErApplication {

	public static void main(String... args) {
		SpringApplication.run(TrainingHibernateErApplication.class, args);
	}

}
