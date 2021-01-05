package com.jpa;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.entities.Course;
import com.jpa.entities.Student;
import com.jpa.repo.CourseRepo;
import com.jpa.repo.StudentRepo;

@SpringBootApplication
public class StudentToCourseApplication implements CommandLineRunner{
	@Autowired 
	private StudentRepo  studentRepo ;
	@Autowired 
	private CourseRepo  courseRepo ;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentToCourseApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student s1=new Student("Ashoka");
		Student s2=new Student("Ashu");
		Student s3=new Student("pooja");
		Student s4=new Student("chattu");
		Student s5=new Student("hemant");
		Student s6=new Student("yakshith");
		
		Course c1=new Course("Java","Rajeev",LocalDate.of(2020, Month.JANUARY, 04));
		Course c2=new Course("spring boot","Rajeev",LocalDate.of(2020, Month.JANUARY, 04));
		Course c3=new Course("c","sarath",LocalDate.of(2020, Month.JANUARY, 05));
		Course c4=new Course("C#","ashok",LocalDate.of(2020, Month.JANUARY, 03));
		Course c5=new Course("MySql","hemant",LocalDate.of(2020, Month.JANUARY, 01));
		Course c6=new Course("PHP","Ramu",LocalDate.of(2020, Month.JANUARY, 04));
		Course c7=new Course("HTML","Raj",LocalDate.of(2020, Month.JANUARY, 05));
		Course c8=new Course("CSS","Abc",LocalDate.of(2020, Month.JANUARY, 04));
		
		
		c1.getStudents().add(s1);
		c1.getStudents().add(s2);
		c1.getStudents().add(s3);
		
		c2.getStudents().add(s4);
		c2.getStudents().add(s5);
		
		c3.getStudents().add(s6);
		c4.getStudents().add(s1);
		c5.getStudents().add(s2);
		c6.getStudents().add(s4);
		c7.getStudents().add(s3);
		c8.getStudents().add(s6);
		
		
		s1.getCourses().add(c1);
		s1.getCourses().add(c2);
		
		s2.getCourses().add(c3);
		s2.getCourses().add(c4);
		
		s3.getCourses().add(c5);
		s3.getCourses().add(c6);
		
		s4.getCourses().add(c7);
		s5.getCourses().add(c8);
		s6.getCourses().add(c1);
		
		
		
		 
		 studentRepo.save(s1);
		 studentRepo.save(s2);
		 studentRepo.save(s3);
		 studentRepo.save(s4);
		 studentRepo.save(s5);
		 studentRepo.save(s6);
		 
		 courseRepo.save(c1);
		 courseRepo.save(c2);
		 courseRepo.save(c3);
		 courseRepo.save(c4);
		 courseRepo.save(c5);
		 courseRepo.save(c6);
		 courseRepo.save(c7);
		 courseRepo.save(c8);
		 
		
			
		
	}


}
