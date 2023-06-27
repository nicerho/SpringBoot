package com.springboot.example.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.example.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;
//	@Autowired
//	private CourseJpaRepository repository;
	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Learn AWS Jpa!", "Ho"));
		repository.save(new Course(2, "Learn Azure Jpa!", "Ho"));
		repository.save(new Course(3, "Learn DevOps Jpa!", "Ho"));
		repository.deleteById(1l);
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		System.out.println(repository.findByAuthor("Ho"));
		System.out.println(repository.findByAuthor(""));
		System.out.println(repository.findByName("Learn AWS Jpa!"));
		System.out.println(repository.findByName("Learn Azure Jpa!"));
	}

}
