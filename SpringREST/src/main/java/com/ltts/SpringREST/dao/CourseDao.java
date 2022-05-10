package com.ltts.SpringREST.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.SpringREST.entities.Course;

@Repository
public interface CourseDao extends JpaRepository<Course, Long>{

}
