package com.springboot.example.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CourseController {
	
	//Course: id,name,author
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1,"Learn AWS","Ho"),
				new Course(2,"Learn DevOps","Ho"),
				new Course(3,"Learn Azure","Ho"),
				new Course(4,"Learn GCP","Ho")
				);
	}
}
