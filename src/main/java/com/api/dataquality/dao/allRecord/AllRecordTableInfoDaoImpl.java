package com.api.dataquality.dao.allRecord;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.api.dataquality.model.view_allRecord_tableinfor_web;


@Repository
public class AllRecordTableInfoDaoImpl implements AllRecordTableInfoDao {

	private Logger logger = Logger.getLogger(AllRecordTableInfoDaoImpl.class.getName());
	
	@Autowired
	private MongoTemplate mongoTemplate;


	@Override
	public List<view_allRecord_tableinfor_web> getAllRecordTableInfo() {
		return mongoTemplate.findAll(view_allRecord_tableinfor_web.class);
	}

	@Override
	public List<view_allRecord_tableinfor_web> getAllRecordTableInfoByName(String name) {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(name));
		return mongoTemplate.find(query, view_allRecord_tableinfor_web.class);
	}
	
	@Override
	public List<view_allRecord_tableinfor_web> getAllRecordTableInfoByDate(String date) {
		Query query = new Query();
		query.addCriteria(Criteria.where("date_string").is(date));
		return mongoTemplate.find(query, view_allRecord_tableinfor_web.class);
	}

	@Override
	public List<view_allRecord_tableinfor_web> getAllRecordTableInfoByNameDate(String name, String date) {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(name).and("date_string").is(date));
		return mongoTemplate.find(query, view_allRecord_tableinfor_web.class);
	}

	@Override
	public List<view_allRecord_tableinfor_web> getAllRecordTableInfoByDateName(String date, int version) {
		Query query = new Query();
		query.addCriteria(Criteria.where("date_string").is(date).and("version_No").is(version));
		return mongoTemplate.find(query, view_allRecord_tableinfor_web.class);
	}
	
	@Override
	public view_allRecord_tableinfor_web getAllRecordTableInfoByNameDateVersion(String name, String date, int version) {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(name).and("date_string").is(date).and("version_No").is(version));
		return mongoTemplate.findOne(query, view_allRecord_tableinfor_web.class);
	}

	

	

	

	
}
