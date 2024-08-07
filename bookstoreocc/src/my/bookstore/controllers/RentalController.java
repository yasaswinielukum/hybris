package my.bookstore.controllers;

import de.hybris.platform.webservicescommons.mapping.DataMapper;
import de.hybris.platform.webservicescommons.mapping.FieldSetLevelHelper;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import my.bookstore.facades.RentalFacade;
import my.bookstore.facades.rental.data.RentalData;
import my.bookstore.occ.data.rental.RentalDataList;
import my.bookstore.occ.dto.rental.RentalListWsDTO;
import my.bookstore.occ.dto.rental.RentalWsDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "Rentals")
@RequestMapping("/{baseSiteId}/rentals")
public class RentalController {
    protected static final String DEFAULT_FIELD_SET = FieldSetLevelHelper.DEFAULT_LEVEL;
    private RentalFacade rentalFacade;
    private DataMapper dataMapper;

    public RentalController(RentalFacade rentalFacade, DataMapper dataMapper) {
        this.rentalFacade = rentalFacade;
        this.dataMapper = dataMapper;
    }

    @GetMapping("/search")
    @ApiOperation(nickname ="getAllRentals" , value = "Get All Rentals",notes = "getAllRentals")
    @ApiBaseSiteIdParam
    public RentalListWsDTO getAllRentals(
            @ApiFieldsParam @RequestParam(defaultValue =DEFAULT_FIELD_SET ) String fields){
        List<RentalData> allRentals = rentalFacade.getAllRentals();
        RentalDataList rentalDataList = new RentalDataList();
        rentalDataList.setRentals(allRentals);
        return dataMapper.map(rentalDataList,RentalListWsDTO.class,fields);
    }

    @GetMapping("/rental/{rentalId}")
    @ApiOperation(nickname = "getRentalByRentalId", value = "Get Rental By RentalId", notes = "Get Rental By RentalId")
    @ApiBaseSiteIdParam
    public RentalWsDTO getRentalByRentalId(
            @ApiParam(value="Rental Id",required = true) @PathVariable int rentalId,
            @ApiFieldsParam @RequestParam(defaultValue = DEFAULT_FIELD_SET) String fields
    ){
        RentalData rental = rentalFacade.getRentalByRentalId(rentalId);
        return dataMapper.map(rental,RentalWsDTO.class,fields);
    }
}
