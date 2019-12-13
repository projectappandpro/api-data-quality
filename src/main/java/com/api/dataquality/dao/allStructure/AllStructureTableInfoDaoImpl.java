package com.api.dataquality.dao.allStructure;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.api.dataquality.model.view_allRecord_tableinfor_web;
import com.api.dataquality.model.view_allStructure_tableinfor_web;


@Repository
public class AllStructureTableInfoDaoImpl implements AllStructureTableInfoDao {

	private Logger logger = Logger.getLogger(AllStructureTableInfoDaoImpl.class.getName());
	
	@Autowired
	private MongoTemplate mongoTemplate;

	
	@Override
	public List<view_allStructure_tableinfor_web> getAllStructureTableInfo() {
		return mongoTemplate.findAll(view_allStructure_tableinfor_web.class);
	}

	@Override
	public List<view_allStructure_tableinfor_web> getAllStructureTableInfoByName(String name) {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(name));
		return mongoTemplate.find(query, view_allStructure_tableinfor_web.class);
	}

	@Override
	public List<view_allStructure_tableinfor_web> getAllStructureTableInfoByDate(String date) {
		Query query = new Query();
		query.addCriteria(Criteria.where("date_string").is(date));
		return mongoTemplate.find(query, view_allStructure_tableinfor_web.class);
	}

	@Override
	public List<view_allStructure_tableinfor_web> getAllStructureTableInfoByNameDate(String name, String date) {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(name).and("date_string").is(date));
		return mongoTemplate.find(query, view_allStructure_tableinfor_web.class);
	}

	@Override
	public List<view_allStructure_tableinfor_web> getAllStructureTableInfoByDateName(String date, int version) {
		Query query = new Query();
		query.addCriteria(Criteria.where("date_string").is(date).and("version").is(version));
		return mongoTemplate.find(query, view_allStructure_tableinfor_web.class);
	}

	@Override
	public view_allStructure_tableinfor_web getAllStructureableInfoByNameDateVersion(String name, String date,
			int version) {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(name).and("date_string").is(date).and("version").is(version));
		return mongoTemplate.findOne(query, view_allStructure_tableinfor_web.class);
	}



	

	

	

	
}
