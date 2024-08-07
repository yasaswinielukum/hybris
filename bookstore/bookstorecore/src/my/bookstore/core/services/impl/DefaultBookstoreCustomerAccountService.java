package my.bookstore.core.services.impl;

import de.hybris.platform.commerceservices.customer.impl.DefaultCustomerAccountService;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import my.bookstore.core.enums.RewardStatusLevel;
import my.bookstore.core.services.BookstoreCustomerAccountService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultBookstoreCustomerAccountService extends DefaultCustomerAccountService implements BookstoreCustomerAccountService {
    private final DefaultGenericDao<CustomerModel> customerDao;

    public DefaultBookstoreCustomerAccountService(DefaultGenericDao<CustomerModel> customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void updateRewardStatusPoints(CustomerModel customer, OrderModel order) {
        int total = 0;
        List<AbstractOrderEntryModel> orderEntries = order.getEntries();
        for (AbstractOrderEntryModel entry : orderEntries) {
            ProductModel book = entry.getProduct();
            Integer rewardPoints = book.getRewardPoints();
            Long quantity = entry.getQuantity();
            total += rewardPoints * quantity;
        }
        customer.setPoints(customer.getPoints() + total);
        getModelService().save(customer);
    }

    @Override
    public List<CustomerModel> getAllCustomersForLevel(RewardStatusLevel level) {
        //select * from {Customer} where {rewardStatusLevel}=?level
        Map<String, RewardStatusLevel> params = new HashMap<>();
        params.put("rewardStatusLevel", level);
        List<CustomerModel> allCustomers = customerDao.find(params);
        return allCustomers;
    }
}
