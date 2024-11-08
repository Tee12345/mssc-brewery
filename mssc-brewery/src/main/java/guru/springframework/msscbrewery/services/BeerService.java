package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.*;

import java.util.*;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteBeer(UUID beerId);
}
