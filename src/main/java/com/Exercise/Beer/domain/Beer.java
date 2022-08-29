package com.Exercise.Beer.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.util.UUID;


public class Beer {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private long upc;

    private Timestamp createdAt;
    private Timestamp updatedAt;
}
