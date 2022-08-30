package com.Exercise.Beer.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
public class BeerDtoTest extends BaseTest {
    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSerializeDto() throws Exception {
        BeerDto beerDto = getDto();
        String jsonStrong = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonStrong);
    }

    @Test
    void testDeserialize() throws JsonProcessingException {
        String json = "{\"id\":\"07263787-ae22-483c-a3d0-4f20488e0dc3\",\"version\":null,\"createdAt\":\"2022-08-30T09:51:55.4535684+07:00\",\"updatedAt\":\"2022-08-30T09:51:55.4535684+07:00\",\"beerName\":\"Eliezer Beerz\",\"beerStyle\":\"ElzStyle\",\"upc\":12000045,\"price\":12.9,\"quantityOnHand\":null}";
        BeerDto dto = objectMapper.readValue(json,BeerDto.class);
        System.out.println(dto);

    }
}
