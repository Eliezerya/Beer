package com.Exercise.Beer.services;


import com.Exercise.Beer.Repositories.BeerRepository;
import com.Exercise.Beer.domain.Beer;
import com.Exercise.Beer.web.exceptions.NotFoundException;
import com.Exercise.Beer.web.mappers.BeerMapper;
import com.Exercise.Beer.web.model.BeerDto;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class BeerServiceImpl implements BeerService {

    @Autowired
    BeerRepository beerRepository;
    private final BeerMapper beerMapper;

    //    @Override
//    public BeerDto getBeerById(UUID beerId) {
//        return BeerDto.builder().id(UUID.randomUUID())
//                .beerName("el Beer")
//                .beerStyle("Pale ale")
//                .build();
//    }
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return beerMapper.beerToBeerDto(beerRepository.findById(beerId).orElseThrow(NotFoundException::new));

    }
//    @Override
//    public BeerDto saveNewBeer() {
//        return BeerDto.builder()
//                .id(UUID.randomUUID())
//                .build();
//    }


    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return beerMapper.beerToBeerDto(beerRepository.save(beerMapper.beerDtoToBeer(beerDto)));
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {
        Beer beer = beerRepository.findById(beerId).orElseThrow(NotFoundException::new);
        beer.setBeerName(beerDto.getBeerName());
        beer.setBeerStyle(beerDto.getBeerStyle().name());
        beer.setPrice(beerDto.getPrice());
        beer.setUpc(beerDto.getUpc());
        return beerMapper.beerToBeerDto(beerRepository.save(beer));

    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("deleting a beer...");
    }
}
