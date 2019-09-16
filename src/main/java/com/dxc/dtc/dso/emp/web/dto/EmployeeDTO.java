package com.dxc.dtc.dso.emp.web.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class EmployeeDTO implements Serializable {

	private static final long serialVersionUID = 4090396258529126284L;

	@JsonProperty("empId")
	private Integer empId;
	
	@JsonProperty("empUsername")
	private String empUsername;
	
	@JsonProperty("empEmail")
	private String empEmail;
	
	@JsonProperty("empPassword")
	private String empPassword;
	
	@JsonProperty("active")
	private boolean active;
	
	@JsonSerialize(as = Date.class)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="MM/dd/yyyy'T'HH:mm:ss.SSSXXX")
	@JsonProperty("createdDate")
	private Date createdDate;
	
	@JsonSerialize(as = Date.class)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="MM/dd/yyyy'T'HH:mm:ss.SSSXXX")
	@JsonProperty("updatedDate")
	private Date updatedDate;
	
	@JsonProperty("empFirstname")
	private String empFirstname;
	
	@JsonProperty("empLastname")
	private String empLastname;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpUsername() {
		return empUsername;
	}

	public void setEmpUsername(String empUsername) {
		this.empUsername = empUsername;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getEmpFirstname() {
		return empFirstname;
	}

	public void setEmpFirstname(String empFirstname) {
		this.empFirstname = empFirstname;
	}

	public String getEmpLastname() {
		return empLastname;
	}

	public void setEmpLastname(String empLastname) {
		this.empLastname = empLastname;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
}
