package my.bookstore.core.services;

import de.hybris.platform.commerceservices.customer.CustomerAccountService;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.CustomerModel;
import my.bookstore.core.enums.RewardStatusLevel;

import java.util.List;

public interface BookstoreCustomerAccountService extends CustomerAccountService {
    void updateRewardStatusPoints(CustomerModel customer, OrderModel order);
    List<CustomerModel> getAllCustomersForLevel(RewardStatusLevel level);


}
