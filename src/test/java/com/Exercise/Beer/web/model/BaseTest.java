package com.Exercise.Beer.web.model;

import com.Exercise.Beer.web.model.BeerDto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {
    BeerDto getDto(){
        return BeerDto.builder()
                .beerName("Eliezer Beerz")
                .beerStyle(BeerStyleEnum.ElzStyle)
                .id(UUID.randomUUID())
                .createdAt(OffsetDateTime.now())
                .updatedAt(OffsetDateTime.now())
                .price(new BigDecimal("12.9"))
                .upc(12000045L)
                .myLocalDate(LocalDate.now())
                .build();
    }
}
