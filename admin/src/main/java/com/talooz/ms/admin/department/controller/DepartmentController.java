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

import com.talooz.ms.admin.department.dao.DepartmentRepository;
import com.talooz.ms.admin.department.entity.Department;
import com.talooz.ms.admin.department.entity.DepartmentParticulars;


@RestController
@RequestMapping("/department")
public class DepartmentController {
	protected Logger logger = Logger.getLogger(DepartmentController.class.getName());

	private DepartmentRepository departmentRepository;
	
	
	@Autowired
	public DepartmentController(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}
	
	@RequestMapping(value = "/{entityId}/{schoolYearId}", method=RequestMethod.GET)
	public Department[] departmentListByRouteIdAndEntityId(@PathVariable("entityId") Integer entityId, @PathVariable("schoolYearId") Integer schoolYearId)  {
		
		logger.info("admin-microservice, findByEntityIdAndSchoolYearId() invoked");
		List<Department> departments = departmentRepository.findByEntityIdAndSchoolYearId(entityId, schoolYearId);
		return departments.toArray(new Department[departments.size()]);
		
	}
	
	@RequestMapping(value = "/{entityId}", method=RequestMethod.GET)
	public Department[] departmentListByRouteIdAndEntityId(@PathVariable("entityId") Integer entityId)  {
		
		logger.info("admin-microservice, departmentListByEntityId() invoked");
		List<Department> departments = departmentRepository.findByEntityId(entityId);
		return departments.toArray(new Department[departments.size()]);
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public @ResponseBody Department saveOrUpdate(@RequestBody Department department){
		List<DepartmentParticulars> departmentParticulars = department.getDepartmentParticulars();
		for(int i=0;i<departmentParticulars.size();i++){
			departmentParticulars.get(i).setDepartment(department);
		}
	
		departmentRepository.save(department);
		/*department.setDepartmentParticulars(null);
		List<DepartmentParticulars> mappings = departmentRepository.findByRouteId(department.getRouteId());
		department.setDepartmentParticulars(mappings);*/
		return department;
	}
}
