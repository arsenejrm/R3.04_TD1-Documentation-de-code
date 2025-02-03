package OCP;

/**
 * This interface creates a criteria defined on a Product.
 * It implements the isSatisfied() method which verifies that the criteria is respected
 * @param <Product> the Product on which the Criteria is tested
 */
interface Criteria <Product> {

    /**
     * This method implements a verification of the Criteria on the Product concerned
     * @param product the Product on which the Criteria is tested
     * @return Boolean, true if the Criteria is respected
     */
    boolean isSatisfied(Product product);
}
