package OCP;

/**
 * This class creates a Criteria of Product that validates them if their price is within the defined range
 */
public class PriceIntervalCriteria implements Criteria<Product> {
    double priceMin;
    double priceMax;

    /**
     * This constructor takes a range using double min and max to set Criteria's price interval of Product
     * @param min Integer, the minimum price the Product can have to be selected
     * @param max Integer, the maximum price the Product can have to be selected
     */
    public PriceIntervalCriteria(double min, double max) {
        priceMax = max;
        priceMin = min;
    }

    /**
     * This method verifies that the given Product's price is within the defined range
     * @param product the Product on which the Criteria is tested
     * @return boolean, true if the Product's price is within the defined range
     */
    @Override
    public boolean isSatisfied(Product product) {
        if (product.price != 0) {
            return priceMin <= product.price && product.price < priceMax;
        }
        else {
            return false;
        }
    }
}