package com.chaitanya.mongoref;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.chaitanya.mongoref.repository")
@ComponentScan("com.chaitanya.*")
public class MongoDbRefApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDbRefApplication.class, args);
	}

}
