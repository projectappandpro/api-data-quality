package com.api.dataquality.dao.allStructure;

import java.util.List;

import com.api.dataquality.model.view_allStructure_tableinfor_web;




public interface AllStructureTableInfoDao {

List<view_allStructure_tableinfor_web> getAllStructureTableInfo();
	
	List<view_allStructure_tableinfor_web> getAllStructureTableInfoByName(String name);
	
	List<view_allStructure_tableinfor_web> getAllStructureTableInfoByDate(String date);
	
	List<view_allStructure_tableinfor_web> getAllStructureTableInfoByNameDate(String name,String date);
	
	List<view_allStructure_tableinfor_web> getAllStructureTableInfoByDateName(String date,int version);
	
	view_allStructure_tableinfor_web getAllStructureableInfoByNameDateVersion(String name,String date,int version);

	
}