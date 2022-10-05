package com.qualogy.customerrestapi.adapters.config;

import com.qualogy.customerrestapi.usecases.CustomerRepo;
import com.qualogy.customerrestapi.usecases.CustomerService;
import com.qualogy.customerrestapi.usecases.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

    @Bean
    @Autowired
    public CustomerService customerService(CustomerRepo customerRepo) {
        return new CustomerServiceImpl(customerRepo);
    }



}
