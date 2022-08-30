package com.Exercise.Beer.web.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BeerDto {
    @Null
    private UUID id;

    @Null
    private Integer version;

    @Null
    @JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss") // change the format date
    private OffsetDateTime createdAt;

    @Null
    @JsonFormat(pattern = "yyyy-MM-dd") // change the format date
    private OffsetDateTime updatedAt;


    @NotBlank// used for validating input from the user, if there no data to inputed
//    @Size(max =30)
    private String beerName;
//    @Size(min =3, max = 30)
    @NotBlank
    private BeerStyleEnum beerStyle;

    @Positive
    @NotNull
    private long upc;

//    @Positive
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING) // changing the format
    private BigDecimal price;

    private Integer quantityOnHand;

    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate myLocalDate;
}