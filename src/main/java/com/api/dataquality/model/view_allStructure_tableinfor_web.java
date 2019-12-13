package com.api.dataquality.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection="view_allStructure_tableinfor_web")
public class view_allStructure_tableinfor_web {

	@Field("schema")
	private String schema;
	@Field("table_name")
	private String name;
	@Field("processdate")
	private Date processDate = new Date();
	@Field("countField")
	private int countField;
	@Field("month_id")
	private long vmonth_id;
	@Field("date_string")
	private String dateString;
	@Field("version")
	private int version; 
	@Field("fieldList")
	private List<Fields> fieldList = new ArrayList<Fields>();
	public String getSchema() {
		return schema;
	}
	public void setSchema(String schema) {
		this.schema = schema;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getProcessDate() {
		return processDate;
	}
	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}
	public int getCountField() {
		return countField;
	}
	public void setCountField(int countField) {
		this.countField = countField;
	}
	public long getVmonth_id() {
		return vmonth_id;
	}
	public void setVmonth_id(long vmonth_id) {
		this.vmonth_id = vmonth_id;
	}
	public String getDateString() {
		return dateString;
	}
	public void setDateString(String dateString) {
		this.dateString = dateString;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public List<Fields> getFieldList() {
		return fieldList;
	}
	public void setFieldList(List<Fields> fieldList) {
		this.fieldList = fieldList;
	}
	
	
	
}

class Fields{
	private String name;
	private String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
}

