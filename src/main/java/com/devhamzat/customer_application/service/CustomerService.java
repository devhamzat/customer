package com.devhamzat.customer_application.service;

import com.devhamzat.customer_application.dao.CustomerDAO;
import com.devhamzat.customer_application.exceptions.CustomerNotFoundException;
import com.devhamzat.customer_application.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    private List<Customer> customerList = new CopyOnWriteArrayList<>();
    public Customer addCustomer(Customer customer) {
        return customerDAO.save(customer);
    }

    public List<Customer> getCustomer() {
        return customerDAO.findAll();

    }

    public Customer getCustomer(int customerId) {
        Optional<Customer> optionalCustomer = customerDAO.findById(customerId);
        if (!optionalCustomer.isPresent()) {
            throw new CustomerNotFoundException("Customer record is not available");
        }
        return optionalCustomer.get();
    }

    public Customer updateCustomer(int customerId, Customer customer) {
        customer.setCustomerId(customerId);
        return customerDAO.save(customer);
    }

    public void deleteCustomer(int customerId) {
        customerDAO.deleteById(customerId);
    }
}
