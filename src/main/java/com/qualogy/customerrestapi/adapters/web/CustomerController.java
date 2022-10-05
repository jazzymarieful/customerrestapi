package com.qualogy.customerrestapi.adapters.web;

import com.qualogy.customerrestapi.usecases.Customer;
import com.qualogy.customerrestapi.usecases.CustomerService;
import com.qualogy.customerrestapi.adapters.database.DbCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path = "/get/{customerId}")
//    @Operation
//    @Parameter
//    @ApiResponse
    public Customer getCustomer(@PathVariable("customerId") Integer customerId) {
        System.out.println("arrived");
        return customerService.getCustomer(customerId);
    }

    @GetMapping(path = "/getall")
    public List<Customer> getCustomers() {
        System.out.println("Has been triggered");
        return customerService.getCustomers();
    }

    @PostMapping(path = "/post")
    public void createCustomer(@RequestBody Customer customer) {
        System.out.println("arrived: " + customer);
        customerService.addCustomer(customer);
    }

    @DeleteMapping(path = "/delete/{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Long customerId) {
        System.out.println("This text here: " + customerId);
        customerService.deleteCustomer(customerId);
    }

    @PutMapping(path = "update/{customerId}")
    public void putCustomer(@RequestBody DbCustomer customer, @PathVariable("customerId") Long customerId) {
        System.out.println(customer);
        System.out.println("And the id: " + customerId);
//        customerService.putCustomer(customer,customerId);
    }

}
