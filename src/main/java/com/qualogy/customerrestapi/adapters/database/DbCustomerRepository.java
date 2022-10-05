package com.qualogy.customerrestapi.adapters.database;

import com.qualogy.customerrestapi.adapters.database.DbCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DbCustomerRepository extends JpaRepository<DbCustomer, Long> {

    public DbCustomer getDbCustomersById(Integer customerId);

}
