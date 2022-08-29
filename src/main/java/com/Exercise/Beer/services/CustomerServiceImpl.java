package com.Exercise.Beer.services;

import com.Exercise.Beer.web.model.BeerDto;
import com.Exercise.Beer.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .customerId(UUID.randomUUID())
                .name("dan elie").build();
    }

    @Override
    public CustomerDto saveCustomer() {
        return CustomerDto.builder()
                .customerId(UUID.randomUUID())
                .build();
    }

    @Override
    public CustomerDto updateCustomer(UUID customerId) {
        return null;
    }

    @Override
    public void deleteCustomer() {

    }


}
