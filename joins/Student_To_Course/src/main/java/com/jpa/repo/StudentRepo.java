package com.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.entities.Student;


@Repository
public interface StudentRepo  extends JpaRepository<Student,Integer>{

}
