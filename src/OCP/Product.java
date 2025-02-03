package OCP;

/**
 * This class defines a product with name, color, size and price
 */
public class Product {
    public String name;
    public Color color;
    public Size size;
    public double price;

    /**
     * This constructor creates a Product with name, color and size
     * @param name String, name of the Product
     * @param color Color, color of the Product
     * @param size Size, size of the Product
     */
    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.price = 0;
    }

    /**
     * This constructor creates a Product with name, color, size and price
     * @param name String, name of the Product
     * @param color Color, color of the Product
     * @param size Size, size of the Product
     * @param price double, price of the Product
     */
    public Product(String name, Color color, Size size, double price) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.price = price;
    }
}