package com.qualogy.customerrestapi.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DbCustomerRepository extends JpaRepository<DbCustomer, Long> {
}
