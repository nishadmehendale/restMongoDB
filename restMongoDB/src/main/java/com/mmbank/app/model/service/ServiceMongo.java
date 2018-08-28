package com.mmbank.app.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmbank.app.model.dao.DAOCustomer;
import com.mmbank.framework.account.pojo.BankAccount;
import com.mmbank.framework.account.pojo.Customer;
import com.mmbank.framework.account.pojo.PaymentGateway;

@Service
public class ServiceMongo{
	@Autowired
	private DAOAccount daoAccount/*= new DAO()*/;
	@Autowired
	private DAOCustomer daoCustomer;
	
	/* (non-Javadoc)
	 * @see com.demo.customer.model.Service#create(java.lang.String)
	 */
	/*public List<BankAccount> viewAllAccounts() {
		return daoAccount.findAll();
	}
	
	
	public void saveAccount(BankAccount bankAccount) {
		daoAccount.save(bankAccount);
		
	}

	public int getSizeOfAccountList() {
		// TODO Auto-generated method stub
		return (int) daoAccount.count();
	}*/
	
	public List<Customer> viewAllCustomers() {
		return daoCustomer.findAll();
	}
	
	public Customer viewCustomerById(int id) {
		return daoCustomer.findById(id).get();
	}
	public void saveCustomer(Customer customer) {
		daoCustomer.save(customer);
		
	}
	public BankAccount viewAccountById(int id) {
		return daoAccount.findById(id).get();
	}
	public int getSizeOfCustomerList() {
		// TODO Auto-generated method stub
	
		return (int) daoCustomer.count();
	}
	
	public String withdraw(int accNo,double amount) {
		BankAccount account = viewAccountById(accNo);
		return account.withdraw(amount);		
	}
	public void deposit(int accNo,double amount) {
		BankAccount account = viewAccountById(accNo);
		account.deposit(amount);		
	}
	public boolean FundTransfer(BankAccount sender,BankAccount reciever,double amount) {
		return PaymentGateway.transfer(sender, reciever, amount);
	}
}
