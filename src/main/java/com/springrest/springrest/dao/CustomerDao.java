package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Customer;

public interface CustomerDao extends JpaRepository<Customer,Long>{
	
}