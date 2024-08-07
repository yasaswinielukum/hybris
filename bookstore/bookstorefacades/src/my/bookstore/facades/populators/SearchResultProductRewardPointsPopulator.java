package my.bookstore.facades.populators;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.springframework.util.Assert;
public class SearchResultProductRewardPointsPopulator implements Populator<SearchResultValueData, ProductData> {
    @Override
    public void populate(SearchResultValueData searchResultValueData, ProductData productData) throws ConversionException {
        Assert.notNull(searchResultValueData, "Parameter source cannot be null.");
        Assert.notNull(productData, "Parameter target cannot be null.");
        Integer rewardPoints = (Integer) searchResultValueData.getValues().get("rewardPoints");
        productData.setRewardPoints(rewardPoints == null ? 0 : rewardPoints);
    }
}