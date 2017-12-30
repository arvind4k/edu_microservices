package com.talooz.ms.admin.ui;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.talooz.ms.admin.dao.SchoolYearRepository;
import com.talooz.ms.admin.entity.SchoolYear;


@RestController
@RequestMapping("/schoolyear")
public class SchoolYearController {
	protected Logger logger = Logger.getLogger(SchoolYearController.class.getName());

	private SchoolYearRepository schoolYearRepository;
	
	
	@Autowired
	public SchoolYearController(SchoolYearRepository schoolYearRepository) {
		this.schoolYearRepository = schoolYearRepository;
	}
	
	@RequestMapping(value = "/{entityId}/{schoolYearId}", method=RequestMethod.GET)
	public SchoolYear transportListByRouteIdAndEntityId(@PathVariable("entityId") Integer entityId, @PathVariable("schoolYearId") Integer schoolYearId)  {
		
		logger.info("admin-microservice, transportListByRouteIdAndEntityId() invoked");

		SchoolYear schoolYear = schoolYearRepository.findByEntityIdAndSchoolYearId(entityId, schoolYearId);
		return schoolYear;
		
	}
	
	@RequestMapping(value = "/{entityId}", method=RequestMethod.GET)
	public SchoolYear[] transportListByRouteIdAndEntityId(@PathVariable("entityId") Integer entityId)  {
		
		logger.info("admin-microservice, schoolYearListByEntityId() invoked");
		List<SchoolYear> schoolYears = schoolYearRepository.findByEntityId(entityId);
		return schoolYears.toArray(new SchoolYear[schoolYears.size()]);
		
	}
	/*
	@RequestMapping(method=RequestMethod.POST)
	public @ResponseBody SchoolYear saveOrUpdate(@RequestBody SchoolYear schoolYear){
		schoolYearRepository.save(schoolYear);
		return schoolYear;
	}*/
}
