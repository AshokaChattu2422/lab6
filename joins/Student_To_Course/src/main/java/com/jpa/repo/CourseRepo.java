package com.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.entities.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course,Integer> {

}
