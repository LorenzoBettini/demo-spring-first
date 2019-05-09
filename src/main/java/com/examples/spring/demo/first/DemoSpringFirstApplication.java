package com.examples.spring.demo.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.examples.spring.demo.first.model.Person;
import com.examples.spring.demo.first.repository.PersonRepository;

@SpringBootApplication
public class DemoSpringFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringFirstApplication.class, args);
	}

	@Component
	static class RepositoryInitializer implements CommandLineRunner {
		@Autowired
		private PersonRepository personRepository;
		
		@Override
		public void run(String... args) throws Exception {
			personRepository.save(new Person("Mario", "Rossi"));
			personRepository.save(new Person("Carlo", "Rossi"));
			personRepository.save(new Person("Paolo", "Bianchi"));
		}
	}
}
