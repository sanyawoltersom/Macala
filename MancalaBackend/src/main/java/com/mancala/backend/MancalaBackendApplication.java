package com.mancala.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mancala.backend.datamodels.MancalaGame;

@SpringBootApplication
@EnableMongoRepositories
@EnableAutoConfiguration(exclude= DataSourceAutoConfiguration.class)
public class MancalaBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MancalaBackendApplication.class, args);
		
		//Testing to see relationship between model classes.
		MancalaGame game = new MancalaGame();
		game.show();
	}

}
