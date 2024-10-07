package com.babatunde.services;

import com.babatunde.web.model.*;

import java.util.*;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);
}
