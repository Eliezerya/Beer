package com.Exercise.Beer.web.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class CustomerDto {
    private UUID customerId;
    private String name;
}
