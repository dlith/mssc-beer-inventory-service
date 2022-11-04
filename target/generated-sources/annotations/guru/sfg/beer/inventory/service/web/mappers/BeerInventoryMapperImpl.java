package guru.sfg.beer.inventory.service.web.mappers;

import guru.sfg.beer.inventory.service.domain.BeerInventory;
import guru.sfg.beer.inventory.service.web.model.BeerInventoryDto;
import java.sql.Timestamp;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-04T13:01:45+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 14.0.1 (Oracle Corporation)"
)
@Component
public class BeerInventoryMapperImpl implements BeerInventoryMapper {

    @Override
    public BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO) {
        if ( beerInventoryDTO == null ) {
            return null;
        }

        UUID id = null;
        Long version = null;
        Timestamp createdDate = null;
        Timestamp lastModifiedDate = null;
        UUID beerId = null;
        String upc = null;
        Integer quantityOnHand = null;

        BeerInventory beerInventory = new BeerInventory( id, version, createdDate, lastModifiedDate, beerId, upc, quantityOnHand );

        return beerInventory;
    }

    @Override
    public BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory) {
        if ( beerInventory == null ) {
            return null;
        }

        BeerInventoryDto beerInventoryDto = new BeerInventoryDto();

        return beerInventoryDto;
    }
}
