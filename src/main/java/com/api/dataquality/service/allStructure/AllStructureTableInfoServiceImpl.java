package com.api.dataquality.service.allStructure;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.api.dataquality.dao.allRecord.AllRecordTableInfoDao;
import com.api.dataquality.dao.allStructure.AllStructureTableInfoDao;
import com.api.dataquality.model.view_allRecord_tableinfor_web;
import com.api.dataquality.model.view_allStructure_tableinfor_web;


@Repository
public class AllStructureTableInfoServiceImpl implements AllStructureTableInfoService {

	private Logger logger = Logger.getLogger(AllStructureTableInfoServiceImpl.class.getName());
	
	@Autowired
	private AllStructureTableInfoDao allStructureTableInfoDao;


	@Override
	public List<view_allStructure_tableinfor_web> getAllStructureTableInfo() {
		return allStructureTableInfoDao.getAllStructureTableInfo();
	}

	@Override
	public List<view_allStructure_tableinfor_web> getAllStructureTableInfoByName(String name) {
		return allStructureTableInfoDao.getAllStructureTableInfoByName(name);
	}

	@Override
	public List<view_allStructure_tableinfor_web> getAllStructureTableInfoByDate(String date) {
		return allStructureTableInfoDao.getAllStructureTableInfoByDate(date);
	}

	@Override
	public List<view_allStructure_tableinfor_web> getAllStructureTableInfoByNameDate(String name, String date) {
		return allStructureTableInfoDao.getAllStructureTableInfoByNameDate(name, date);
	}
	
	@Override
	public List<view_allStructure_tableinfor_web> getAllStructureTableInfoByDateVersion(String date, int version) {
		return allStructureTableInfoDao.getAllStructureTableInfoByDateName(date, version);
	}

	@Override
	public view_allStructure_tableinfor_web getAllStructureTableInfoByNameDateVersion(String name, String date, int version) {
		return allStructureTableInfoDao.getAllStructureableInfoByNameDateVersion(name, date, version);
	}

	

	

	
}
