package com.Exercise.Beer.web.controller;

import com.Exercise.Beer.Repositories.BeerRepository;
import com.Exercise.Beer.domain.Beer;
import com.Exercise.Beer.services.BeerService;
import com.Exercise.Beer.web.mappers.BeerMapper;
import com.Exercise.Beer.web.model.BeerDto;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/beer")
@RequiredArgsConstructor
//@Deprecated -> possesses change and moved to new api
public class BeerController {

    private final BeerMapper beerMapp;

    private final BeerService beerService;
    private final BeerRepository beerRepository;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@Valid @RequestBody BeerDto beerDto){
        beerService.saveNewBeer(beerDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateById(@Valid @RequestBody BeerDto beerDto, @PathVariable("beerId") UUID beerId){
        beerService.updateBeer(beerId,beerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);

    }


//    @PostMapping
//    public ResponseEntity handlepost (@Valid @RequestBody BeerDto beerDto){
//        BeerDto savedDto = beerService.saveNewBeer();
//        HttpHeaders httpHeaders = new HttpHeaders( );
//
//        //to do hostname to url
//        httpHeaders.add("location", "/api/v1/beer/" + savedDto.getId().toString());
//        return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
//    }
//
//    @PutMapping("/{beerId}")
//    public  ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId,@Valid @RequestBody BeerDto beerDto){
//
//        beerService.updateBeer(beerId, beerDto);
//        return new ResponseEntity(HttpStatus.NO_CONTENT);
//    }
//
//    @DeleteMapping("/{beerId}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void handleDelete(@PathVariable("beerId") UUID beerId){
//
//        beerService.deleteBeer(beerId);
//
//    }



}




















