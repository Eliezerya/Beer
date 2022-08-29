package com.Exercise.Beer.services;

import com.Exercise.Beer.web.model.BeerDto;
import com.Exercise.Beer.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveCustomer();

    CustomerDto updateCustomer(UUID customerId);

    void deleteCustomer();
}
