package com.ltts.SpringREST.service;

//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.SpringREST.dao.CourseDao;
import com.ltts.SpringREST.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

//	List<Course> list;
	
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl() {
		
//		list = new ArrayList<>();
//		list.add(new Course(101, "Core Java", "This course contains basics of core java"));
//		list.add(new Course(102, "Python", "This course contains basics of core python"));
	
	}


	@Override
	public List<Course> getCourses() {
		
//		return list;
		return courseDao.findAll(); 
	}


	@Override
	public Course getCourse(long courseId) {
		
//		Course c = null;
//		for(Course course:list) {
//			if(course.getId() == courseId) {
//				c = course;
//				break;
//			}
//		}
//		return c;
		
		return courseDao.getById(courseId);
	}


	@Override
	public Course addCourse(Course course) {

//		list.add(course);
//		return course;

		courseDao.save(course);
		return course;
		
	}


	@Override
	public Course updateCourse(Course course) {
		
//		list.forEach(e->{
//			if(e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
//		return course;
		
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long courseId) {

//		list = list.stream().filter(e->e.getId() != courseId).collect(Collectors.toList());
		
		
		courseDao.deleteById(courseId);
		
	}

}
