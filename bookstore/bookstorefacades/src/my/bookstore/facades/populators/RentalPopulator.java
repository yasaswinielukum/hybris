package my.bookstore.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import my.bookstore.core.model.RentalModel;
import my.bookstore.facades.rental.data.RentalData;

public class RentalPopulator implements Populator<RentalModel, RentalData> {
    @Override
    public void populate(RentalModel rentalModel, RentalData rentalData) throws ConversionException {
        rentalData.setRentalId(rentalModel.getRentalId());
        rentalData.setStartDate(rentalModel.getStartDate());
        rentalData.setEndDate(rentalModel.getEndDate());
    }
}