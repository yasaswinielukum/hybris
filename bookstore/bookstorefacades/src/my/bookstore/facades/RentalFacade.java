package my.bookstore.facades;

import my.bookstore.facades.rental.data.RentalData;

import java.util.List;

public interface RentalFacade {

    List<RentalData> getAllRentals();
    RentalData getRentalByRentalId(int rentalId);

}
