package com.api.dataquality.dao.allStructure;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.api.dataquality.model.view_allStructure_tableinfor_web;


@Repository
public interface AllStructureTableInfoRepository extends MongoRepository<view_allStructure_tableinfor_web, String> {
}
