package com.api.dataquality.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection="view_allRecord_tableinfor_web")
public class view_allRecord_tableinfor_web {

	@Field("schema")
	private String schema;
	@Field("table_name")
	private String name;
	@Field("job_id")
	private String job_id;
	@Field("processdate")
	private Date processDate = new Date();
	@Field("countRecord")
	private int countRecord;
	@Field("countField")
	private int countField;
	@Field("month_id")
	private long vmonth_id;
	@Field("date_string")
	private String dateString;
	@Field("version_No")
	private int version; 
	
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
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public Date getProcessDate() {
		return processDate;
	}
	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}
	public int getCountRecord() {
		return countRecord;
	}
	public void setCountRecord(int countRecord) {
		this.countRecord = countRecord;
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
	
	
	
}
