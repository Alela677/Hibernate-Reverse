package models;
// Generated 6 dic 2022 3:21:56 by Hibernate Tools 4.3.6.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Customers generated by hbm2java
 */
public class Customers implements java.io.Serializable {

	private int customerNumber;
	private Employees employees;
	private String customerName;
	private String contactLastName;
	private String contactFirstName;
	private String phone;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	private BigDecimal creditLimit;
	private Set orderses = new HashSet(0);
	private Set paymentses = new HashSet(0);

	public Customers() {
	}

	public Customers(int customerNumber, String customerName, String contactLastName, String contactFirstName,
			String phone, String addressLine1, String city, String country) {
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.contactLastName = contactLastName;
		this.contactFirstName = contactFirstName;
		this.phone = phone;
		this.addressLine1 = addressLine1;
		this.city = city;
		this.country = country;
	}

	public Customers(int customerNumber, Employees employees, String customerName, String contactLastName,
			String contactFirstName, String phone, String addressLine1, String addressLine2, String city, String state,
			String postalCode, String country, BigDecimal creditLimit, Set orderses, Set paymentses) {
		this.customerNumber = customerNumber;
		this.employees = employees;
		this.customerName = customerName;
		this.contactLastName = contactLastName;
		this.contactFirstName = contactFirstName;
		this.phone = phone;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
		this.creditLimit = creditLimit;
		this.orderses = orderses;
		this.paymentses = paymentses;
	}

	public int getCustomerNumber() {
		return this.customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public Employees getEmployees() {
		return this.employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getContactLastName() {
		return this.contactLastName;
	}

	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}

	public String getContactFirstName() {
		return this.contactFirstName;
	}

	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public BigDecimal getCreditLimit() {
		return this.creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

	public Set getPaymentses() {
		return this.paymentses;
	}

	public void setPaymentses(Set paymentses) {
		this.paymentses = paymentses;
	}

}
