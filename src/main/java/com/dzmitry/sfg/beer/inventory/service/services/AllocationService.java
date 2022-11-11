package com.dzmitry.sfg.beer.inventory.service.services;

import com.dzmitry.sfg.brewery.model.BeerOrderDto;

public interface AllocationService {

    Boolean allocateOrder(BeerOrderDto beerOrderDto);
}
