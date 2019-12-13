package com.api.dataquality.service.allRecord;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.api.dataquality.dao.allRecord.AllRecordTableInfoDao;
import com.api.dataquality.model.view_allRecord_tableinfor_web;


@Repository
public class AllRecordTableInfoServiceImpl implements AllRecordTableInfoService {

	private Logger logger = Logger.getLogger(AllRecordTableInfoServiceImpl.class.getName());
	
	@Autowired
	private AllRecordTableInfoDao allRecordTableInfoDao;


	@Override
	public List<view_allRecord_tableinfor_web> getAllRecordTableInfo() {
		return allRecordTableInfoDao.getAllRecordTableInfo();
	}

	@Override
	public List<view_allRecord_tableinfor_web> getAllRecordTableInfoByName(String name) {
		return allRecordTableInfoDao.getAllRecordTableInfoByName(name);
	}

	@Override
	public List<view_allRecord_tableinfor_web> getAllRecordTableInfoByDate(String date) {
		return allRecordTableInfoDao.getAllRecordTableInfoByDate(date);
	}

	@Override
	public List<view_allRecord_tableinfor_web> getAllRecordTableInfoByNameDate(String name, String date) {
		return allRecordTableInfoDao.getAllRecordTableInfoByNameDate(name, date);
	}
	
	@Override
	public List<view_allRecord_tableinfor_web> getAllRecordTableInfoByDateVersion(String date, int version) {
		return allRecordTableInfoDao.getAllRecordTableInfoByDateName(date, version);
	}

	@Override
	public view_allRecord_tableinfor_web getAllRecordTableInfoByNameDateVersion(String name, String date, int version) {
		return allRecordTableInfoDao.getAllRecordTableInfoByNameDateVersion(name, date, version);
	}

	

	

	
}
