package com.babatunde.services;

import com.babatunde.web.model.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();

    }
}
