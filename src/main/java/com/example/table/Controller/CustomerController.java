package com.example.table.Controller;

import com.example.table.model.Customer;
import com.example.table.repository.CustomerRespository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

  @Autowired
  private CustomerRespository customerRespository;

  @GetMapping(value = "/all")
  public List<Customer> getCustomers() {
    return customerRespository.findAll();
  }

}
