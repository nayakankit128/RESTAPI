package com.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.entites.Course;

@Service
public class CourseServiceImp implements CourseService {

	
	List<Course> list;
	public CourseServiceImp() {
		list = new ArrayList<>();
		list.add(new Course(114, "Java Core", "This is Basic of java fundamantal"));
		list.add(new Course(115, "Python Advanced", "Advanced Python Course"));
		list.add(new Course(116, "HTML Basic And Advanced", "Pro Level HTML Course"));
		list.add(new Course(117, "Kotlin", "This is Advanced Level Andorid App Development"));
		list.add(new Course(118, "JavaScript Course", "Web Developement Course"));
	}
	
	@Override
	public List<Course> getCourse() {
		
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		
		Course c=null;
		
		for(Course course : list) {
			if(course.getId()==courseId) {
				c = course;
				break;
			}
		}
		
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

}
