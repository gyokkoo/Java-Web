package com.springbootlecutre.lecture;

import com.springbootlecutre.lecture.entities.Animal;
import com.springbootlecutre.lecture.entities.Dog;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LectureApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LectureApplication.class, args);
		Dog dog = context.getBean(Dog.class);
        System.out.println(dog.getClass().getSimpleName());
        // ((AbstractApplicationContext)context).close();
	}

	@Bean
	public Animal getDog() {
		return new Dog();
	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
}
