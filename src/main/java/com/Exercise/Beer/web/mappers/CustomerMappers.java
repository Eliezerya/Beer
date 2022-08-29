package com.Exercise.Beer.web.mappers;

import com.Exercise.Beer.domain.Customer;
import com.Exercise.Beer.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMappers {
    Customer customerToCustomerDto(CustomerDto customerDto);
    CustomerDto customerDtoToCustomer(Customer customer);
}
