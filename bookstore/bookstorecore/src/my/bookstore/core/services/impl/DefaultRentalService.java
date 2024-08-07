package my.bookstore.core.services.impl;

import de.hybris.platform.core.model.user.CustomerModel;
import my.bookstore.core.daos.RentalDao;
import my.bookstore.core.model.BookModel;
import my.bookstore.core.model.RentalModel;
import my.bookstore.core.services.RentalService;

import java.util.List;

public class DefaultRentalService implements RentalService {
    private RentalDao rentalDao;

    public DefaultRentalService(RentalDao rentalDao) {
        this.rentalDao = rentalDao;
    }

    @Override
    public List<RentalModel> getActiveRentalsForCustomer(CustomerModel customer) {
        return rentalDao.getActiveRentalsForCustomer(customer);
    }

    @Override
    public List<BookModel> getMostRentedBooks(int numberOfBooks) {
        return rentalDao.getMostRentedBooks(numberOfBooks);
    }

    @Override
    public List<RentalModel> getAllRentals() {
        return rentalDao.getAllRentals();
    }

    @Override
    public RentalModel getRentalByRentalId(int rentalId) {
        return rentalDao.getRentalByRentalId(rentalId);
    }
}
