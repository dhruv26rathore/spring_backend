package com.springrest.springrest.services;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CustomerDao;
import com.springrest.springrest.entities.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	
	//List<Customer> list;
	public CustomerServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Customer(144,"Merchant1","Boarding Status","Boarding in Progress","2019","2020"));
//		list.add(new Customer(145,"Merchant2","Boarding Status","Boarding in Progress","2019","2020"));
//		list.add(new Customer(146,"Merchant3","Boarding Status","Boarding in Progress","2019","2020"));
//		list.add(new Customer(147,"Merchant4","Boarding Status","Boarding in Progress","2019","2020"));
//		list.add(new Customer(148,"Merchant5","Boarding Status","Boarding in Progress","2019","2020"));
	}
	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerDao.findAll();
	}
	
	@Override
	public Customer getCustomer(long customerId) {
//		Customer c = null;
//		for(Customer customer:list) {
//			if(customer.getId()==customerId) {
//				c = customer;
//				break;
//			}
//		}
		return customerDao.getOne(customerId);
	}
	
	
	@Override
	public Customer addCustomer(Customer customer) {
//		list.add(customer);
		customerDao.save(customer);
		return customer;
	}
	
	
	@Override
	public Customer updateCustomer(Customer customer) {
//		list.forEach(e ->{
//			if(e.getId()==customer.getId()) {
//				e.setMerchant(customer.getMerchant());
//				e.setRole_status_type(customer.getRole_status_type());
//				e.setRole_status(customer.getRole_status());
//				e.setValid_from(customer.getValid_from());
//				e.setValid_to(customer.getValid_to());
//			}});
		customerDao.save(customer);
		return customer;
	}
	
	@Override
	public void deleteCustomer(long parseLong) {
//		list=this.list.stream().filter(e ->e.getId()!=parseLong).collect(Collectors.toList());
		Customer entity = customerDao.getOne(parseLong);
		customerDao.delete(entity);
	}
}