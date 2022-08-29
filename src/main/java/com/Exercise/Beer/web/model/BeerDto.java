package com.Exercise.Beer.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BeerDto {
    @Null
    private UUID id;
    @NotBlank// used for validating input from the user, if there no data to inputed
    @Size(max =30)
    private String beerName;
    @NotBlank
    @Size(min =3, max = 30)
    private String beerStyle;
    @Positive
    private long upc;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
}