package OCP;

/**
 * This class creates a Criteria based on a Product's name
 */
public class NameCriteria implements Criteria<Product> {
    String filteredName;

    /**
     * This constructor creates a Criteria of Product based on the name given
     * @param name String, name of a Product
     */
    public NameCriteria(String name) {
        filteredName = name;
    }

    /**
     * This method verifies the name of the Product using a Criteria
     * @param product the Product on which the Criteria is tested
     * @return Boolean, true if the Poduct's name given equals Criteria's name
     */
    @Override
    public boolean isSatisfied(Product product) {
        return filteredName.equals(product.name);
    }
}
