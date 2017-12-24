package com.talooz.ms.admin.ui;

//import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.talooz.ms.admin.dao.TransportRepository;
import com.talooz.ms.admin.entity.Transport;
import com.talooz.ms.admin.entity.TransportParticulars;



@RestController
@RequestMapping("/transport")
public class TransportController {
	protected Logger logger = Logger.getLogger(TransportController.class.getName());

	private TransportRepository transportRepository;
	
	@Autowired
	public TransportController(TransportRepository transportRepository) {
		this.transportRepository = transportRepository;
	}
	/*
	@RequestMapping(method=RequestMethod.GET)
	public Transport[] listAll() {
		logger.info("admin-microservice, listAll() invoked");
		List<Transport> transports = transportRepository.
				findFeeCategories();
		return transports.toArray(new Transport[transports.size()]);
	}*/
	
	@RequestMapping(method=RequestMethod.POST)
	public @ResponseBody Transport saveOrUpdate(@RequestBody Transport transport){
		List<TransportParticulars> transportParticulars = transport.getTransportParticulars();
		for(int i=0;i<transportParticulars.size();i++){
			transportParticulars.get(i).setTransport(transport);
		}
		/*feeCategory.setCreationDate(new Date());
		feeCategory.setUpdationDate(new Date());*/
		transportRepository.save(transport);
		transport.setTransportParticulars(null);
		List<TransportParticulars> mappings = transportRepository.findByRouteId(transport.getRouteId());
		transport.setTransportParticulars(mappings);
		return transport;
	}
}
