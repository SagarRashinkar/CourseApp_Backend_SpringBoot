package com.ltts.SpringREST.service;

import java.util.List;

import com.ltts.SpringREST.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();

	public Course getCourse(long courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);
	
	public void deleteCourse(long courseId);
}
