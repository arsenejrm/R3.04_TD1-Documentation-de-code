package OCP;

/**
 * This class defines a Criteria on a Product's Size
 */
public class SizeCriteria implements Criteria<Product> {
    Size filteredSize;

    /**
     * This constructor defines a SizeCriteria of Product using a given Size
     * @param size
     */
    public SizeCriteria(Size size) {
        filteredSize = size;
    }

    /**
     * This method verifies the Size of the given Product
     * @param product the Product on which the Criteria is tested
     * @return boolean true if The SIze of the given Product equals the Criteria's Size
     */
    @Override
    public boolean isSatisfied(Product product) {
        return filteredSize == product.size;
    }
}
