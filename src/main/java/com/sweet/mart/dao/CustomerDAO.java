package com.sweet.mart.dao;

import java.util.Collection;


import org.springframework.stereotype.Repository;

import com.sweet.mart.model.Counters;
import com.sweet.mart.model.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;



@Repository
public class CustomerDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	public Collection<Customer> getAllCustomers(){
		
		try {
			
			return entityManager.createQuery("From Customer", Customer.class).getResultList();
			
		} catch(Exception e) {
			
			throw new RuntimeException(e);
		}
	}
	
	@jakarta.transaction.Transactional
	public void registerCustomer(Customer customer){
		try {	
			
			Counters counterCustomerId = entityManager.find(Counters.class,"customer");
			Counters counterAddressId = entityManager.find(Counters.class, "address");
			
			String CustomerId = counterCustomerId.getIntitialValue() + counterCustomerId.nextValue();
			String AddressId = counterAddressId.getIntitialValue() + counterAddressId.nextValue();
			
			customer.setCustomerId(CustomerId);
			customer.setFirstName(customer.getFirstName());
			customer.setLastName(customer.getLastName());
			customer.setEmailId(customer.getEmailId());
			customer.setMobileNo(customer.getMobileNo());
			customer.setPassword(customer.getPassword());
			customer.setAddressId(AddressId);
			
			entityManager.persist(customer);
			
			System.out.println(customer);
			
		}
		catch (Exception e) 
		{
			throw new RuntimeException(e);
		}
	}
}
