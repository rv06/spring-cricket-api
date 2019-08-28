package com.cricket.api.CricketGameApi;

import com.cricket.api.CricketGameApi.jpa.MatchResultJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.cricket.api.CricketGameApi.data")
@SpringBootApplication
public class CricketGameApiApplication  {

	public static void main(String[] args) {
		SpringApplication.run(CricketGameApiApplication.class, args);
		System.out.println("Running");
	}


}
