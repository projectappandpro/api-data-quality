package com.api.dataquality.dao.allRecord;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.api.dataquality.model.view_allRecord_tableinfor_web;


@Repository
public interface AllRecordTableInfoRepository extends MongoRepository<view_allRecord_tableinfor_web, String> {
}
