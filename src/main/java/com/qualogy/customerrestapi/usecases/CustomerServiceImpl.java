package com.qualogy.customerrestapi.usecases;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo customerRepo;

    public CustomerServiceImpl(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public Customer getCustomer(Integer customerId) {
        return customerRepo.getCustomersById(customerId);
    }

    public List<Customer> getCustomers() {
        return customerRepo.getCustomers();
    }

    public void addCustomer(Customer customer) {
        customerRepo.addCustomer(customer);
    }

//    public void putCustomer(DbCustomer customer, Long customerId) {
//        DbCustomer checkedCustomer = customerRepo.findById(customerId)
//                        .orElseThrow(() -> new IllegalStateException("Record does not exist"));
//        checkedCustomer.setName(customer.getName());
//        checkedCustomer.setEmail(customer.getEmail());
//        checkedCustomer.setDirectMail(customer.isDirectMail());
//        customerRepo.save(checkedCustomer);
//    }

    public void deleteCustomer(Long customerId) {
        customerRepo.deleteCustomer(customerId);
    }


}
