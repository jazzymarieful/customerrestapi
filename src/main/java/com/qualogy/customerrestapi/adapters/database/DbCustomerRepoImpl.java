package com.qualogy.customerrestapi.adapters.database;

import com.qualogy.customerrestapi.usecases.Customer;
import com.qualogy.customerrestapi.usecases.CustomerRepo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DbCustomerRepoImpl implements CustomerRepo {

    private final DbCustomerRepository customerRepo;

    public DbCustomerRepoImpl(DbCustomerRepository customerRepo) {
        this.customerRepo = customerRepo;
    }

    private Customer mapper(DbCustomer dbCustomer) {
        Customer customer = new Customer();
        customer.setId(dbCustomer.getId());
        customer.setName(dbCustomer.getName());
        customer.setEmail(dbCustomer.getEmail());
        customer.setDirectMail(dbCustomer.isDirectMail());
        return customer;
    }

    private DbCustomer reverseMap(Customer customer) {
        DbCustomer dbCustomer = new DbCustomer();
        dbCustomer.setId(customer.getId());
        dbCustomer.setName(customer.getName());
        dbCustomer.setEmail(customer.getEmail());
        dbCustomer.setDirectMail(customer.isDirectMail());
        return dbCustomer;
    }

    @Override
    public Customer getCustomersById(Integer customerId) {
        DbCustomer dbCustomer = customerRepo.getDbCustomersById(customerId);
        return mapper(dbCustomer);
    }

    @Override
    public List<Customer> getCustomers() {
        List<DbCustomer> dbCustomerList = customerRepo.findAll();
        var customerList = dbCustomerList.stream().map(x -> mapper(x)).collect(Collectors.toList());
        return customerList;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerRepo.save(reverseMap(customer));
    }

    @Override
    public void putCustomer(Customer customer, Long customerId) {

    }

    @Override
    public void deleteCustomer(Long customerId) {
        customerRepo.deleteById(customerId);
    }
}
