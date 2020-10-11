package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	private long id;
	private String merchant;
	private String role_status_type;
	private String role_status;
	private String valid_from;
	private String valid_to;
	public Customer(long id, String merchant, String role_status_type, String role_status, String valid_from,
			String valid_to) {
		super();
		this.id = id;
		this.merchant = merchant;
		this.role_status_type = role_status_type;
		this.role_status = role_status;
		this.valid_from = valid_from;
		this.valid_to = valid_to;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMerchant() {
		return merchant;
	}
	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}
	public String getRole_status_type() {
		return role_status_type;
	}
	public void setRole_status_type(String role_status_type) {
		this.role_status_type = role_status_type;
	}
	public String getRole_status() {
		return role_status;
	}
	public void setRole_status(String role_status) {
		this.role_status = role_status;
	}
	public String getValid_from() {
		return valid_from;
	}
	public void setValid_from(String valid_from) {
		this.valid_from = valid_from;
	}
	public String getValid_to() {
		return valid_to;
	}
	public void setValid_to(String valid_to) {
		this.valid_to = valid_to;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", merchant=" + merchant + ", role_status_type=" + role_status_type
				+ ", role_status=" + role_status + ", valid_from=" + valid_from + ", valid_to=" + valid_to + "]";
	}	
	
	
}