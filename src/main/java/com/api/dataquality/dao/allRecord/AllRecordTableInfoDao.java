package com.api.dataquality.dao.allRecord;

import java.util.List;

import com.api.dataquality.model.view_allRecord_tableinfor_web;



public interface AllRecordTableInfoDao {

List<view_allRecord_tableinfor_web> getAllRecordTableInfo();
	
	List<view_allRecord_tableinfor_web> getAllRecordTableInfoByName(String name);
	
	List<view_allRecord_tableinfor_web> getAllRecordTableInfoByDate(String date);
	
	List<view_allRecord_tableinfor_web> getAllRecordTableInfoByNameDate(String name,String date);
	
	List<view_allRecord_tableinfor_web> getAllRecordTableInfoByDateName(String date,int version);
	
	view_allRecord_tableinfor_web getAllRecordTableInfoByNameDateVersion(String name,String date,int version);

	
}