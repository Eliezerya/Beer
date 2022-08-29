package com.Exercise.Beer.web.mappers;

import com.Exercise.Beer.domain.Beer;
import com.Exercise.Beer.web.model.BeerDto;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-29T13:24:47+0700",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.4 (Eclipse Adoptium)"
)
public class BeerMapperImpl implements BeerMapper {

    @Override
    public BeerDto beerToBeerDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDto.BeerDtoBuilder beerDto = BeerDto.builder();

        return beerDto.build();
    }

    @Override
    public Beer beerDtoToBeer(BeerDto beerDto) {
        if ( beerDto == null ) {
            return null;
        }

        Beer beer = new Beer();

        return beer;
    }
}
