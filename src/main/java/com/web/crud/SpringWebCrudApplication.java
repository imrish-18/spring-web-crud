package com.web.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.web.repo.StudentRepository;
import com.web.repo.TodoJpaRepository;


@ComponentScan(basePackages = "com.web.controller")
@ComponentScan(basePackages = "com.web.repo")
@SpringBootApplication(scanBasePackages={
"com.web.controller", "com.web.repo"})
@EnableMongoRepositories(basePackageClasses = {StudentRepository.class,TodoJpaRepository.class})
public class SpringWebCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebCrudApplication.class, args);
		System.out.println("hello rishabh");
	}

}
