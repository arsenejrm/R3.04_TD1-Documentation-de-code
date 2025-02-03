package OCP;

import java.util.List;
import java.util.stream.Stream;

/**
 * This class defines a filter which is applicated to a Stream of Product.
 * It uses Criteria class to define how the Product are filtered
 */
public class ProductFilter {

    /**
     * This method filter the List of Product using the Criteria given
     * @param products List of Product, the list to be filtered
     * @param criteria Criteria of Product, the Criteria used to filter the Product
     * @return List of Product, contains every Product that matches the Criteria
     */
    public Stream<Product> filter (List<Product> products, Criteria criteria) {
        return products.stream().filter(criteria::isSatisfied);
    }
}
