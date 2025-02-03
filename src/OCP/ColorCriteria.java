package OCP;

/**
 * This class creates a criteria of color that can be used to filter a list of colored objects.
 * It implements the Criteria of Products interface, with his method isSatisfied(), to filter lists of Products using a Criteria.
 *
 */
public class ColorCriteria implements Criteria<Product> {
    Color filteredColor;

    /**
     * This constructor instances a ColorCriteria using a Color in parameter.
     * @param color From Color type, used to define the filtered color.
     */
    public ColorCriteria(Color color) {
        filteredColor = color;
    }

    /**
     * This method is implemented by Criteria of Products interface to check the Color of a Product.
     * @param product the Product you want to verify the Color
     * @return boolean, true if the current ColorCriteria Color is equal to the Product Color
     */
    @Override
    public boolean isSatisfied(Product product) {
        return filteredColor == product.color;
    }
}
