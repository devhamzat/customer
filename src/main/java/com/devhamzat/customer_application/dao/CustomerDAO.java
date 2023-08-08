package com.devhamzat.customer_application.dao;

import com.devhamzat.customer_application.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CustomerDAO extends CrudRepository<Customer,Integer>
{
    @Override
    List<Customer> findAll();

}

//    Customer findAllById(Integer customerId);
//
//    @Override
//    Iterable<Customer> findAllById(Iterable<Integer> customerId);
//}
