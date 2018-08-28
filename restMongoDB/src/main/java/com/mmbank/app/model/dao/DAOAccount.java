package com.mmbank.app.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mmbank.framework.account.pojo.BankAccount;

@Repository
public interface DAOAccount extends JpaRepository<BankAccount,Integer>{

}
