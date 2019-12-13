package com.api.dataquality.service.allRecord;

import java.util.List;

import com.api.dataquality.model.view_allRecord_tableinfor_web;



public interface AllRecordTableInfoService {

	List<view_allRecord_tableinfor_web> getAllRecordTableInfo();
	
	List<view_allRecord_tableinfor_web> getAllRecordTableInfoByName(String name);
	
	List<view_allRecord_tableinfor_web> getAllRecordTableInfoByDate(String date);
	
	List<view_allRecord_tableinfor_web> getAllRecordTableInfoByNameDate(String name,String date);
	
	List<view_allRecord_tableinfor_web> getAllRecordTableInfoByDateVersion(String date,int version);
	
	view_allRecord_tableinfor_web getAllRecordTableInfoByNameDateVersion(String name,String date,int version);
	
}