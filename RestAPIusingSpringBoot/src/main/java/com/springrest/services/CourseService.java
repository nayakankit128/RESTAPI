package com.springrest.services;

import java.util.List;

import com.springrest.entites.Course;

public interface CourseService {
	
	public List<Course> getCourse();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);

}
