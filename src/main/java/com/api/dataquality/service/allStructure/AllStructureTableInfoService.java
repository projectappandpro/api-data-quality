package com.api.dataquality.service.allStructure;

import java.util.List;

import com.api.dataquality.model.view_allRecord_tableinfor_web;
import com.api.dataquality.model.view_allStructure_tableinfor_web;



public interface AllStructureTableInfoService {

	List<view_allStructure_tableinfor_web> getAllStructureTableInfo();
	
	List<view_allStructure_tableinfor_web> getAllStructureTableInfoByName(String name);
	
	List<view_allStructure_tableinfor_web> getAllStructureTableInfoByDate(String date);
	
	List<view_allStructure_tableinfor_web> getAllStructureTableInfoByNameDate(String name,String date);
	
	List<view_allStructure_tableinfor_web> getAllStructureTableInfoByDateVersion(String date,int version);
	
	view_allStructure_tableinfor_web getAllStructureTableInfoByNameDateVersion(String name,String date,int version);
	
}