package com.qualogy.customerrestapi.usecases;

import java.util.List;

public interface CustomerRepo {

    Customer getCustomersById(Integer customerId);

    List<Customer> getCustomers();

    void addCustomer(Customer customer);

    void putCustomer(Customer customer, Long customerId);

    void deleteCustomer(Long customerId);





}
