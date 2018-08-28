package com.mmbank.app.model.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mmbank.framework.account.pojo.Customer;

@Repository
public interface DAOCustomer extends MongoRepository<Customer, Integer>{

}
