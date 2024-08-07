package my.bookstore.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import my.bookstore.core.model.RentalModel;
import my.bookstore.core.services.RentalService;
import my.bookstore.facades.RentalFacade;
import my.bookstore.facades.rental.data.RentalData;

import java.util.List;

public class DefaultRentalFacade implements RentalFacade {
    RentalService rentalService;
    Converter<RentalModel,RentalData> rentalConverter;

    public DefaultRentalFacade(RentalService rentalService, Converter<RentalModel, RentalData> rentalConverter) {
        this.rentalService = rentalService;
        this.rentalConverter = rentalConverter;
    }

    @Override
    public List<RentalData> getAllRentals() {
        List<RentalModel> rentals = rentalService.getAllRentals();
        List<RentalData> rentalDataList = rentalConverter.convertAll(rentals);
        return rentalDataList;
    }

    @Override
    public RentalData getRentalByRentalId(int rentalId) {
        RentalModel rentalModel = rentalService.getRentalByRentalId(rentalId);
        RentalData rentalData = rentalConverter.convert(rentalModel);
        return rentalData;
    }
}