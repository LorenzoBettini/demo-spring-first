package com.examples.spring.demo.first;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.examples.spring.demo.first.model.Person;
import com.examples.spring.demo.first.repository.PersonRepository;

@SpringBootApplication
public class DemoSpringFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringFirstApplication.class, args);
	}

	@Bean
	public CommandLineRunner repositoryInitializer(PersonRepository personRepository) {
		return (args) -> {
			personRepository.save(new Person("Mario", "Rossi"));
			personRepository.save(new Person("Carlo", "Rossi"));
			personRepository.save(new Person("Paolo", "Bianchi"));
		};
	}
}
