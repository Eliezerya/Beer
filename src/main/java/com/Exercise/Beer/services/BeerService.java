package com.Exercise.Beer.services;

import com.Exercise.Beer.web.model.BeerDto;

import java.util.UUID;

public  interface BeerService {
    public BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer();

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    void deleteBeer(UUID beerId);

}
