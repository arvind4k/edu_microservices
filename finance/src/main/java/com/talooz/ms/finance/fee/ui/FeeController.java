package com.talooz.ms.finance.fee.ui;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.talooz.ms.finance.common.model.Page;
import com.talooz.ms.finance.fee.dao.FeeBatchMappingRespository;
import com.talooz.ms.finance.fee.dao.FeeCategoryRepository;
import com.talooz.ms.finance.fee.dao.FeeParticularRepository;
import com.talooz.ms.finance.fee.dao.FineRepository;
import com.talooz.ms.finance.fee.dao.FineSlabRepository;
import com.talooz.ms.finance.fee.entity.FeeBatchMapping;
import com.talooz.ms.finance.fee.entity.FeeCategory;
import com.talooz.ms.finance.fee.entity.FeeParticular;
import com.talooz.ms.finance.fee.entity.Fine;
import com.talooz.ms.finance.fee.entity.FineSlab;

@RestController
@RequestMapping("/fee")
public class FeeController {
	protected Logger logger = Logger.getLogger(FeeController.class.getName());

	private FeeCategoryRepository feeCategoryRepository;
	private FeeBatchMappingRespository feeBatchMappingRespository;
	private FeeParticularRepository feeParticularRepository;
	private FineSlabRepository fineSlabRepository;
	private FineRepository fineRepository;

	@Autowired
	public FeeController(FeeCategoryRepository feeCategoryRepository,
			FeeBatchMappingRespository feeBatchMappingRespository, FeeParticularRepository feeParticularRepository,FineSlabRepository fineSlabRepository,FineRepository fineRepository) {
		this.feeCategoryRepository = feeCategoryRepository;
		this.feeBatchMappingRespository = feeBatchMappingRespository;
		this.feeParticularRepository = feeParticularRepository;
		this.fineRepository=fineRepository;
		this.fineSlabRepository=fineSlabRepository;
	}

	@RequestMapping(method=RequestMethod.GET)
	public FeeCategory[] listAll() {
		logger.info("finance-microservice, listAll() invoked");
		List<FeeCategory> fees = feeCategoryRepository.findFeeCategories();
		return fees.toArray(new FeeCategory[fees.size()]);
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public FeeCategory[] listAll(@RequestBody Page page) {
		logger.info("finance-microservice, listAll() invoked");
		Sort sort = new Sort(new Sort.Order(page.getSortOrder(), page.getSortColumn()));
		Pageable pageable = new PageRequest(page.getPageNo(), page.getItemsPerPage(), sort);
		List<FeeCategory> payments = feeCategoryRepository.findFeeCategories(pageable);
		return payments.toArray(new FeeCategory[payments.size()]);
	}

	@RequestMapping(value = "/list/{batchId}", method = RequestMethod.GET)
	public FeeCategory[] feeListByBatchId(@PathVariable("batchId") Long batchId) {
		logger.info("finance-microservice, feeListByBatchId() invoked");
		List<FeeCategory> fees = feeCategoryRepository.findFeeCategoriesByBatchId(batchId);
		return fees.toArray(new FeeCategory[fees.size()]);
	}

	@RequestMapping(value = "/{feeCategoryId}", method = RequestMethod.GET)
	public @ResponseBody FeeCategory byId(@PathVariable("feeCategoryId") Long id) {
		logger.info("finance-microservice, byId() : " + id);
		FeeCategory feeCategory = feeCategoryRepository.findOne(id);
		feeCategory.setFeeBatchMapping(null);
		List<FeeBatchMapping> mappings = feeBatchMappingRespository
				.findBatchesByFeeCategoryId(feeCategory.getFeeCategoryId());
		feeCategory.setFeeBatchMapping(mappings);
		return feeCategory;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody FeeCategory saveOrUpdate(@RequestBody FeeCategory feeCategory) {
		List<FeeBatchMapping> batchMapping = feeCategory.getFeeBatchMapping();
		for (int i = 0; i < batchMapping.size(); i++) {
			batchMapping.get(i).setFeeCategory(feeCategory);
		}
		if (null != feeCategory.getFeeCategoryId()) {
			feeBatchMappingRespository.deleteByFeeCategoryId(feeCategory.getFeeCategoryId());
			feeCategory.setUpdationDate(new Date());
		} else {
			feeCategory.setCreationDate(new Date());
			feeCategory.setUpdationDate(new Date());
		}
		feeCategory.setObsolete(Integer.valueOf(0));
		feeCategoryRepository.save(feeCategory);
		feeCategory.setFeeBatchMapping(null);
		List<FeeBatchMapping> mappings = feeBatchMappingRespository
				.findBatchesByFeeCategoryId(feeCategory.getFeeCategoryId());
		feeCategory.setFeeBatchMapping(mappings);
		return feeCategory;
	}

	@RequestMapping(value = "/batches/{feeCategoryId}", method = RequestMethod.GET)
	public FeeBatchMapping[] getBatchesByFeeCategoryId(@PathVariable("feeCategoryId") Long id) {
		logger.info("finance-microservice, getBatchesByPaymentId() invoked");
		List<FeeBatchMapping> mappings = feeBatchMappingRespository.findBatchesByFeeCategoryId(id);
		return mappings.toArray(new FeeBatchMapping[mappings.size()]);
	}

	@RequestMapping(value = "/particulars/{feeCategoryId}/{batchId}", method = RequestMethod.GET)
	public FeeParticular[] getFeeParticularsByFeeIdAndBatchId(@PathVariable("feeCategoryId") Long feeCategoryId,
			@PathVariable("batchId") Long batchId) {
		logger.info("finance-microservice, listPayments() invoked");
		List<FeeParticular> particulars = feeParticularRepository.findByFeeCategoryIdAndBatchId(feeCategoryId, batchId);
		return particulars.toArray(new FeeParticular[particulars.size()]);
	}
	
	@RequestMapping(value = "/particulars/{particularId}", method = RequestMethod.GET)
	public FeeParticular getFeeParticularsById(@PathVariable("particularId") Long particularId) {
		return feeParticularRepository.findById(particularId);
	}

	@RequestMapping(value = "/particular", method = RequestMethod.POST)
	public @ResponseBody FeeParticular[] saveOrUpdateParticulars(@RequestBody FeeParticular[] feeParticulars) {
		for(int i=0;i<feeParticulars.length;i++){
			if (null != feeParticulars[i].getParticularId()) {
				feeParticulars[i].setUpdationDate(new Date());
			} else {
				feeParticulars[i].setCreationDate(new Date());
				feeParticulars[i].setUpdationDate(new Date());
			}
			feeParticularRepository.save(feeParticulars[i]);
		}
		
		return feeParticulars;
	}
	
	@RequestMapping(value="/fine", method = RequestMethod.POST)
	public @ResponseBody Fine saveOrUpdateFines(@RequestBody Fine fine) {
		if (fine.getFineId().intValue()==0) {
			fine.setCreationDate(new Date());
			fine.setFineId(null);
		}
		
		List<FineSlab> fineSlabs = fine.getFineSlabs();
		for (int i = 0; i < fineSlabs.size(); i++) {
			fineSlabs.get(i).setFine(fine);
		}
		
		fineRepository.save(fine);
		fine.setFineSlabs(null);
		List<FineSlab> fineSlabList = fineSlabRepository.findFineSlabsByFineId(fine.getFineId());
		fine.setFineSlabs(fineSlabList);
		return fine;
	}
	
	@RequestMapping(value="/fine", method = RequestMethod.GET)
	public @ResponseBody Fine[] findAllFines() {
		List<Fine> fineList= fineRepository.findAllFines();
		return fineList.toArray(new Fine[fineList.size()]);
	}
	
	@RequestMapping(value="/fine/{fineId}", method = RequestMethod.GET)
	public @ResponseBody Fine findFineById(@PathVariable("fineId") Integer fineId) {
		Fine fine = fineRepository.findFineById(fineId);
		List<FineSlab> fineSlabList = fineSlabRepository.findFineSlabsByFineId(fine.getFineId());
		fine.setFineSlabs(fineSlabList);
		return fine;
	}
}
