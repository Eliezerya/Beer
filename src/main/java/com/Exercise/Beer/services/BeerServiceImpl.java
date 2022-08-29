package com.Exercise.Beer.services;


import com.Exercise.Beer.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("el Beer")
                .beerStyle("Pale ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer() {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {
        return null;
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("deleting a beer...");
    }
}
