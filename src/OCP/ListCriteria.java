package OCP;

import java.util.List;

/**
 * This class implements the Criteria interface and verifies several Critaria on a Product
 */
public class ListCriteria implements Criteria<Product>{
    List<Criteria<Product>> criteriaList;

    /**
     * This constructor creates a ListCriteria by taking a List containig several Criteria of Product
     * @param criteriaList a Lis containing Criteria of Product
     */
    public ListCriteria(List<Criteria<Product>> criteriaList) {
        this.criteriaList = criteriaList;
    }

    /**
     * This method verifies that a Product verifies every Criteria of Product contained in the List.
     * @param product the Product on which the Criteria is tested
     * @return Boolean, true if every Criteria of Product is respected by the given Product
     */
    public boolean isSatisfied(Product product) {
        for (Criteria<Product> criteria : criteriaList) {
            if (!criteria.isSatisfied(product)) {
                return false;
            }
        }
        return true;
    }
}
