package com.qualogy.customerrestapi.usecases;

import java.util.List;

public interface CustomerService {

    Customer getCustomer(Integer customerId);

    List<Customer> getCustomers();

    void addCustomer(Customer customer);

    void deleteCustomer(Long customerId);

}
