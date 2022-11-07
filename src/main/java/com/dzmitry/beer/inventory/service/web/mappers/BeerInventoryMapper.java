package com.dzmitry.beer.inventory.service.web.mappers;

import com.dzmitry.beer.inventory.service.web.model.BeerInventoryDto;
import com.dzmitry.beer.inventory.service.domain.BeerInventory;
import org.mapstruct.Mapper;

/**
 * Created by jt on 2019-05-31.
 */
@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
