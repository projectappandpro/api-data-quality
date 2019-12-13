package com.api.dataquality.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.dataquality.dao.allRecord.AllRecordTableInfoDao;
import com.api.dataquality.dao.allRecord.AllRecordTableInfoRepository;
import com.api.dataquality.model.view_allRecord_tableinfor_web;
import com.api.dataquality.model.view_allStructure_tableinfor_web;
import com.api.dataquality.service.allRecord.AllRecordTableInfoService;
import com.api.dataquality.service.allStructure.AllStructureTableInfoService;

@RestController
@RequestMapping(value = "/allStructure")
public class AllStructureTableInfoController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	@Autowired
	private AllStructureTableInfoService allStructureTableInfoService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<view_allStructure_tableinfor_web> getAllStructure() {
		LOG.info("Getting all record.");
		return allStructureTableInfoService.getAllStructureTableInfo();
	}

	@RequestMapping(value = "", method = RequestMethod.GET,params = "name")
	public List<view_allStructure_tableinfor_web> getAllStructureByName(String name) {
		LOG.info("Getting all record by name.");
		return allStructureTableInfoService.getAllStructureTableInfoByName(name);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET,params = "date")
	public List<view_allStructure_tableinfor_web> getAllStructureByDate(String date) {
		LOG.info("Getting all record by name.");
		return allStructureTableInfoService.getAllStructureTableInfoByDate(date);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET,params = {"name","date"})
	public List<view_allStructure_tableinfor_web> getAllStructureByNameDate(String name,String date) {
		LOG.info("Getting all record by name.");
		return allStructureTableInfoService.getAllStructureTableInfoByNameDate(name,date);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET,params = {"date","version"})
	public List<view_allStructure_tableinfor_web> getAllStructureByDateVersion(String date,int version) {
		LOG.info("Getting all record by name.");
		return allStructureTableInfoService.getAllStructureTableInfoByDateVersion(date,version);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET,params = {"name","date","version"})
	public view_allStructure_tableinfor_web getAllStructureByNameDateVersion(String name,String date,int version) {
		LOG.info("Getting all record by name.");
		return allStructureTableInfoService.getAllStructureTableInfoByNameDateVersion(name, date, version);
	}
	


	
	
	
}