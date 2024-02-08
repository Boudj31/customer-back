package fr.dawan.demo.mapper;

import fr.dawan.demo.dto.CustomerDto;
import fr.dawan.demo.dto.CustomerRegisterDto;
import fr.dawan.demo.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    Customer customerRegisterDtoToCustomer(CustomerRegisterDto dto);
    CustomerDto customerToCustomerDto(Customer customer);
}
