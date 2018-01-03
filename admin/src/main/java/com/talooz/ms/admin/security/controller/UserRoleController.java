package com.talooz.ms.admin.security.controller;

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

import com.talooz.ms.admin.security.dao.UserRoleRepository;
import com.talooz.ms.admin.security.entity.UserRole;
import com.talooz.ms.admin.security.entity.UserRoleParticulars;


@RestController
@RequestMapping("/role")
public class UserRoleController {
	protected Logger logger = Logger.getLogger(UserRoleController.class.getName());

	private UserRoleRepository userRoleRepository;
	
	
	@Autowired
	public UserRoleController(UserRoleRepository userRoleRepository) {
		this.userRoleRepository = userRoleRepository;
	}
	
	@RequestMapping(value = "/{entityId}/{roleId}", method=RequestMethod.GET)
	public UserRole[] userRoleListByRouteIdAndEntityId(@PathVariable("entityId") Integer entityId, @PathVariable("roleId") Integer roleId)  {
		
		logger.info("admin-microservice, findByEntityIdAndSchoolYearId() invoked");
		List<UserRole> userRoles = userRoleRepository.findByEntityIdAndRoleId(entityId, roleId);
		return userRoles.toArray(new UserRole[userRoles.size()]);
		
	}
	
	@RequestMapping(value = "/{entityId}", method=RequestMethod.GET)
	public UserRole[] userRoleListByRouteIdAndEntityId(@PathVariable("entityId") Integer entityId)  {
		
		logger.info("admin-microservice, userRoleListByEntityId() invoked");
		List<UserRole> userRoles = userRoleRepository.findByEntityId(entityId);
		return userRoles.toArray(new UserRole[userRoles.size()]);
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public @ResponseBody UserRole saveOrUpdate(@RequestBody UserRole userRole){
		List<UserRoleParticulars> userRoleParticulars = userRole.getUserRoleParticulars();
		for(int i=0;i<userRoleParticulars.size();i++){
			userRoleParticulars.get(i).setUserRole(userRole);
		}
	
		userRoleRepository.save(userRole);
		/*userRole.setUserRoleParticulars(null);
		List<UserRoleParticulars> mappings = userRoleRepository.findByRouteId(userRole.getRouteId());
		userRole.setUserRoleParticulars(mappings);*/
		return userRole;
	}
}
