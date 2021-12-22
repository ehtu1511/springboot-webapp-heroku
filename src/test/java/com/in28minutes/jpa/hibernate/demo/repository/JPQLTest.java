package com.in28minutes.jpa.hibernate.demo.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

//import org.hibernate.query.Query;
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
class JPQLTest {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	EntityManager em;

	@Test
	void JPQL_BasicTest() {
		
		List result_course_list = em.createQuery("Select c From Courses c").getResultList();
		logger.info("Select c From Courses c ====> {}",result_course_list);
		
	}
	
	@Test
	void JPQL_TypedTest() {
		
		TypedQuery<Courses> tq = em.createQuery("Select c From Courses c", Courses.class);
		List resultList = tq.getResultList();
		logger.info("Select c From Courses c ====> {}",resultList);
		
	}
	
	@Test
	void JPQL_whereTest() {
		
		TypedQuery<Courses> tq = em.createQuery("Select c From Courses c where name like '%100 steps'", Courses.class);
		List resultList = tq.getResultList();
		logger.info("Select c From Courses c ====> {}",resultList);
		
	}
	
	@Test
	void Native_QueriesTest() {
		
		Query q = em.createNativeQuery("Select * From Courses",Courses.class);
		List resultList = q.getResultList();
		logger.info("Select * From Courses(This is Native Query) ====> {}",resultList);
		
	}
	
	@Test
	void Native_Queries_where_parameter_Test() {
		
		Query q = em.createNativeQuery("Select * From Courses Where id = ?",Courses.class);
		q.setParameter(1, 10001L);
		List resultList = q.getResultList();
		logger.info("Select * From Courses Where id = ?(This is Native Query) ====> {}",resultList);
		
	}
	
	@Test
	void Native_Queries_where_named_parameter_Test() {
		
		Query q = em.createNativeQuery("Select * From Courses Where id = :id",Courses.class);
		q.setParameter("id", 10001L);
		List resultList = q.getResultList();
		logger.info("Select * From Courses Where id = ?(This is Native Query) ====> {}",resultList);
		
	}


}
