package com.in28minutes.jpa.hibernate.demo.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.jpa.hibernate.demo.DemoApplication;
import com.in28minutes.jpa.hibernate.demo.entity.Courses;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
class CourseRepositoryTest {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	CourseRepository repository;

//	@Test
//	void findById_BasicTest() {
//		logger.info("Test is Running!!!");
//		
//		Courses course =repository.findById(10001L);
//		assertEquals("JPA in 50 steps",course.getName());
//		
//	}
//	
//	@Test
//	@DirtiesContext
//	void deleteById_BasicTest() {		
//		repository.deleteById(10002L);
//		assertNull(repository.findById(10002L));
//		
//	}
//	
//	@Test
//	@DirtiesContext
//	void save_BasicTest() {	
//		//Get a course
//		Courses course =repository.findById(10002L);
//		assertEquals("Hibernate in 50 steps",course.getName());
//		//Update the details
//		course.setName("Hibernate in 50 steps - Updated");
//		repository.save(course);
//		//Check the value
//		Courses course1 =repository.findById(10002L);
//		assertEquals("Hibernate in 50 steps - Updated",course1.getName());
//		
//	}

}
