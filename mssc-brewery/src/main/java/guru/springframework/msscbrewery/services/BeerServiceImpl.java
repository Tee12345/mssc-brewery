package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
       return BeerDto.builder().id(UUID.randomUUID())
               .beerName("Galaxy Cat")
               .beerStyle("Pale Ale")
               .build();
    }
    @Override
    public BeerDto savedNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }
    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        // todo impl - would add a real impl to update beer

    }
    @Override
    public void deleteBeer(UUID beerId) {
          log.debug("Deleting beer...");
    }
}
