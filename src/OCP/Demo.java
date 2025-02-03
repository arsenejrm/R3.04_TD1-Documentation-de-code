package OCP;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL, 1.75);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE, 450);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = List.of(apple, tree, house);

        ProductFilter filter = new ProductFilter();
        ColorCriteria greenCriteria = new ColorCriteria(Color.GREEN);
        PriceIntervalCriteria priceCriteria = new PriceIntervalCriteria(1, 500);
        ListCriteria criteriaList = new ListCriteria(List.of(greenCriteria, priceCriteria));
        filter.filter(products, criteriaList).forEach(product -> System.out.println(" - " + product.name + " is green"));
    }
}
