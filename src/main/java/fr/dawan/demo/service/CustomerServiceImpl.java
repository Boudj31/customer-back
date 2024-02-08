package fr.dawan.demo.service;

import fr.dawan.demo.dto.CustomerDto;
import fr.dawan.demo.dto.CustomerRegisterDto;
import fr.dawan.demo.mapper.CustomerMapper;
import fr.dawan.demo.model.Customer;
import fr.dawan.demo.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

     private final CustomerRepository customerRepository;
     private final CustomerMapper customerMapper;


    @Override
    public CustomerDto registerCustomer(CustomerRegisterDto customerToAdd) {
        Customer customer = CustomerMapper.INSTANCE.customerRegisterDtoToCustomer(customerToAdd);
        return customerMapper.customerToCustomerDto(customerRepository.save(customer));
    }

    @Override
    public List<CustomerDto> getAllCustomer() {
        return customerRepository.findAll()
                .stream()
                .map(customerMapper::customerToCustomerDto)
                .collect(Collectors.toList());
    }
    // port(dto) + adapter (mapper)
}
