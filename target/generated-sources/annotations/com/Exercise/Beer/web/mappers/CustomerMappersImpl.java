package com.Exercise.Beer.web.mappers;

import com.Exercise.Beer.domain.Customer;
import com.Exercise.Beer.web.model.CustomerDto;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-30T10:27:04+0700",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.4 (Eclipse Adoptium)"
)
public class CustomerMappersImpl implements CustomerMappers {

    @Override
    public Customer customerToCustomerDto(CustomerDto customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        Customer customer = new Customer();

        return customer;
    }

    @Override
    public CustomerDto customerDtoToCustomer(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDto.CustomerDtoBuilder customerDto = CustomerDto.builder();

        return customerDto.build();
    }
}
