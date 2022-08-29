package com.Exercise.Beer.web.mappers;

import com.Exercise.Beer.domain.Beer;
import com.Exercise.Beer.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper( uses = DateMapper.class)
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
