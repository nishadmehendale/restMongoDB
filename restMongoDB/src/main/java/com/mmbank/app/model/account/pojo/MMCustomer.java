package com.mmbank.app.model.account.pojo;

import com.mmbank.framework.account.pojo.Customer;

public class MMCustomer extends Customer {
	private int[] accountNumber = new int[3];
	private int i=0;
	public MMCustomer(String customerName, long contactNumber, String dateOfBirth, String email) {
		super(customerName, contactNumber, dateOfBirth, email);
	}
	public int[] getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber[i] = accountNumber;
		i=i+1;
	}
	@Override
	public String toString() {
		return "MMCustomer [accountNumber=" + accountNumber[0] + ", toString()=" + super.toString() + "]";
	}
}
