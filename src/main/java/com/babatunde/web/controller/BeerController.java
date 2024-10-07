package com.babatunde.web.controller;

import com.babatunde.services.*;
import com.babatunde.web.model.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;


import java.util.*;

@RequestMapping("api/v1/beer")
@RestController
public class BeerController {
    private final BeerService beerService;
    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{find}"})
    public ResponseEntity<BeerDto> getBeer(UUID beerId) {

        return new ResponseEntity<BeerDto>(beerService.getBeerById(beerId), HttpStatus.OK);
    }


}
