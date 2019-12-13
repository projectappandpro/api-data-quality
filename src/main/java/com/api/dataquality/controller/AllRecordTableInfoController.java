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
import com.api.dataquality.service.allRecord.AllRecordTableInfoService;

@RestController
@RequestMapping(value = "/allRecord")
public class AllRecordTableInfoController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	@Autowired
	private AllRecordTableInfoService allRecordTableInfoService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<view_allRecord_tableinfor_web> getAllRecord() {
		LOG.info("Getting all record.");
		return allRecordTableInfoService.getAllRecordTableInfo();
	}

	@RequestMapping(value = "", method = RequestMethod.GET,params = "name")
	public List<view_allRecord_tableinfor_web> getAllRecordByName(String name) {
		LOG.info("Getting all record by name.");
		return allRecordTableInfoService.getAllRecordTableInfoByName(name);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET,params = "date")
	public List<view_allRecord_tableinfor_web> getAllRecordByDate(String date) {
		LOG.info("Getting all record by name.");
		return allRecordTableInfoService.getAllRecordTableInfoByDate(date);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET,params = {"name","date"})
	public List<view_allRecord_tableinfor_web> getAllRecordByNameDate(String name,String date) {
		LOG.info("Getting all record by name.");
		return allRecordTableInfoService.getAllRecordTableInfoByNameDate(name,date);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET,params = {"date","version"})
	public List<view_allRecord_tableinfor_web> getAllRecordByDateVersion(String date,int version) {
		LOG.info("Getting all record by name.");
		return allRecordTableInfoService.getAllRecordTableInfoByDateVersion(date,version);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET,params = {"name","date","version"})
	public view_allRecord_tableinfor_web getAllRecordByNameDateVersion(String name,String date,int version) {
		LOG.info("Getting all record by name.");
		return allRecordTableInfoService.getAllRecordTableInfoByNameDateVersion(name, date, version);
	}
	


	
	
	
}