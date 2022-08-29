package com.Exercise.Beer.bootstrap;

import com.Exercise.Beer.Repositories.BeerRepository;
import com.Exercise.Beer.domain.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Locale;

@Component
public class BeerLoader {
    @Autowired
    BeerRepository beerRepository;

    private void loadBeerObject(){
        if(beerRepository.count() == 0){
            beerRepository.save(Beer.builder()
                    .beerName("el beer")
                    .beerStyle("ElenStyle")
                    .quantityOnBrew(200)
                    .minOnHand(12)
                    .upc(330030061L)
                    .price(new BigDecimal("12.95"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("ez beer")
                    .beerStyle("ElzStyle")
                    .quantityOnBrew(200)
                    .minOnHand(12)
                    .upc(330030062L)
                    .price(new BigDecimal("11.95"))
                    .build());

        }

    }

}
