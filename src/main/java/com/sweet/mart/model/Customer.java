package com.sweet.mart.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
@SecondaryTable(name = "addresses", pkJoinColumns = @PrimaryKeyJoinColumn(name = "customerId"))
public class Customer {

	@Id
	@Column(name = "customerId")
	private String customerId;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "emailId")
	private String emailId;
	
	@Column(name = "mobileNo")
	private String mobileNo;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "addressId", table = "Addresses")
	private String addressId;
	
	@Column(name = "completeAddress", table = "Addresses")
	private String completeAddress;

	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerId, String firstName, String lastName, String emailId, String mobileNo,
			String password, String addressId, String completeAddress) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.password = password;
		this.addressId = addressId;
		this.completeAddress = completeAddress;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getCompleteAddress() {
		return completeAddress;
	}

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailId=" + emailId + ", mobileNo=" + mobileNo + ", password=" + password + ", addressId="
				+ addressId + ", completeAddress=" + completeAddress + "]";
	}
	
}

