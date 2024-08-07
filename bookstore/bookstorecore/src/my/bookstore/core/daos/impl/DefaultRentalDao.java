package my.bookstore.core.daos.impl;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import my.bookstore.core.daos.RentalDao;
import my.bookstore.core.model.BookModel;
import my.bookstore.core.model.RentalModel;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DefaultRentalDao extends AbstractItemDao implements RentalDao {

    @Override
    public List<RentalModel> getActiveRentalsForCustomer(CustomerModel customer) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date todayDate = calendar.getTime();
        String query = "Select {r." + RentalModel.PK + "} from {" + RentalModel._TYPECODE
                + " as r JOIN " + CustomerModel._TYPECODE + " as c ON {r." + RentalModel.CUSTOMER + "}={c." + CustomerModel.PK
                + "} } " + "where {r." + RentalModel.STARTDATE + "} <?date and {r." + RentalModel.ENDDATE
                + "} >?date and {c." + CustomerModel.UID + "}=?customer";
        FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(query);
        flexibleSearchQuery.addQueryParameter("customer", customer.getUid());
        flexibleSearchQuery.addQueryParameter("date", todayDate);
        return getFlexibleSearchService().<RentalModel>search(flexibleSearchQuery).getResult();
    }

    @Override
    public List<BookModel> getMostRentedBooks(int numberOfBooks) {
        String query = "select pk from ({{select {b." + BookModel.PK + "} as pk, count(*) as count from " + "{"
                + RentalModel._TYPECODE + " as r JOIN " + BookModel._TYPECODE + " as b ON {r." + RentalModel.PRODUCT
                + "}={b." + BookModel.PK + "}} group by {b." + BookModel.PK + "}"
                + " order by count desc limit ?limit }})";
        FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(query);
        flexibleSearchQuery.addQueryParameter("limit", numberOfBooks);
        return getFlexibleSearchService().<BookModel>search(flexibleSearchQuery).getResult();
    }


    @Override
    public List<RentalModel> getAllRentals() {
        String query = "select {pk} from {Rental}";
        FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(query);
        return getFlexibleSearchService().<RentalModel>search(flexibleSearchQuery).getResult();
    }

    @Override
    public RentalModel getRentalByRentalId(int rentalId) {
        String query = "select {pk} from {Rental} where {rentalId}=?rentalId";
        FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(query);
        flexibleSearchQuery.addQueryParameter("rentalId", rentalId);
        List<RentalModel> rental = getFlexibleSearchService().<RentalModel>search(flexibleSearchQuery).getResult();
        return rental.get(0);
    }


}