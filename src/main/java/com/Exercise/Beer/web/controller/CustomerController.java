package com.Exercise.Beer.web.controller;


import com.Exercise.Beer.services.CustomerService;
import com.Exercise.Beer.web.model.BeerDto;
import com.Exercise.Beer.web.model.CustomerDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
@AllArgsConstructor
public class CustomerController {

    public final CustomerService customerService;

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId){
        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody CustomerDto customerDto){
        customerService.saveCustomer();
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("{customerId}")
    public ResponseEntity handleUpdate(@RequestBody CustomerDto customerDto, @PathVariable("customerId") UUID customerId){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("{customerId}")
    public void handleDelete(@PathVariable UUID customerId){
        customerService.deleteCustomer();
    }
}
