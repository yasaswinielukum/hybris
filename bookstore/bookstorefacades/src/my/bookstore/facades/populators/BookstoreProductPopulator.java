package my.bookstore.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import my.bookstore.core.model.BookModel;


public class BookstoreProductPopulator implements Populator<ProductModel, ProductData> {
    @Override
    public void populate(ProductModel productModel, ProductData productData) throws ConversionException {

        productData.setRentable(productModel.getRentable());
        productData.setRewardPoints(productModel.getRewardPoints());

        if(productModel instanceof BookModel ){
            // ProductModel can not access lanuage, isbn10, isbn13 -book attributes
            BookModel bookModel = (BookModel)productModel;

            productData.setLanguage(bookModel.getLanguage());
            productData.setISBN10(bookModel.getISBN10());
            productData.setISBN13(bookModel.getISBN13());
            productData.setPublisher(bookModel.getPublisher());
            productData.setEdition(bookModel.getEdition());
            productData.setPublishedDate(bookModel.getPublishedDate());
        }

    }
}
