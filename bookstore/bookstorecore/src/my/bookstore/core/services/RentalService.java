package my.bookstore.core.services;

import de.hybris.platform.core.model.user.CustomerModel;
import my.bookstore.core.model.BookModel;
import my.bookstore.core.model.RentalModel;

import java.util.List;

public interface RentalService {
    List<RentalModel> getActiveRentalsForCustomer(CustomerModel customer);

    List<BookModel> getMostRentedBooks(int numberOfBooks);

    List<RentalModel> getAllRentals();
    RentalModel getRentalByRentalId(int rentalId);


}
