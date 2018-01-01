package com.talooz.ms.admin.department.controller;

//import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.talooz.ms.admin.department.dao.CourseRepository;
import com.talooz.ms.admin.department.entity.Course;
import com.talooz.ms.admin.department.entity.CourseParticulars;


@RestController
@RequestMapping("/course")
public class CourseController {
	protected Logger logger = Logger.getLogger(CourseController.class.getName());

	private CourseRepository courseRepository;
	
	
	@Autowired
	public CourseController(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}
	
	@RequestMapping(value = "/{entityId}/{schoolYearId}", method=RequestMethod.GET)
	public Course[] courseListByRouteIdAndEntityId(@PathVariable("entityId") Integer entityId, @PathVariable("schoolYearId") Integer schoolYearId)  {
		
		logger.info("admin-microservice, findByEntityIdAndSchoolYearId() invoked");
		List<Course> courses = courseRepository.findByEntityIdAndSchoolYearId(entityId, schoolYearId);
		return courses.toArray(new Course[courses.size()]);
		
	}
	
	@RequestMapping(value = "/{entityId}", method=RequestMethod.GET)
	public Course[] courseListByRouteIdAndEntityId(@PathVariable("entityId") Integer entityId)  {
		
		logger.info("admin-microservice, courseListByEntityId() invoked");
		List<Course> courses = courseRepository.findByEntityId(entityId);
		return courses.toArray(new Course[courses.size()]);
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public @ResponseBody Course saveOrUpdate(@RequestBody Course course){
		List<CourseParticulars> courseParticulars = course.getCourseParticulars();
		for(int i=0;i<courseParticulars.size();i++){
			courseParticulars.get(i).setCourse(course);
		}
	
		courseRepository.save(course);
		/*course.setCourseParticulars(null);
		List<CourseParticulars> mappings = courseRepository.findByRouteId(course.getRouteId());
		course.setCourseParticulars(mappings);*/
		return course;
	}
}
