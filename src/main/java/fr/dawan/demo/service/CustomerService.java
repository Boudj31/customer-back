package fr.dawan.demo.service;

import fr.dawan.demo.dto.CustomerDto;
import fr.dawan.demo.dto.CustomerRegisterDto;

import java.util.List;

public interface CustomerService {
    // register customer
    CustomerDto registerCustomer(CustomerRegisterDto customerToAdd);
    // get all customer
    List<CustomerDto> getAllCustomer();
}
