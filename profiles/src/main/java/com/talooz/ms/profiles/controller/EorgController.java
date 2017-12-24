package com.talooz.ms.profiles.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.talooz.ms.profiles.dao.EorgRepository;
import com.talooz.ms.profiles.entity.Eorg;

@RestController
@RequestMapping("/eorg")
public class EorgController {
	private EorgRepository eorgRepository;
	//private BCryptPasswordEncoder bCryptPasswordEncoder;

	//public EorgController(EorgRepository eorgRepository) {
		//this.eorgRepository = eorgRepository;
	//}

}
