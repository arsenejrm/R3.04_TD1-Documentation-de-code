package LSP;

/**
 * This class is the client that use classes from package LSP such as Rectangle and Square classes.
 */
public class ClientRectangle {

    /**
     * This class allows to call and use classes from package LSP such as Rectangle and Square classes.
     * @param args Allows to put arguments into the method
     */
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setWidth(200);
        rect.setHeight(300);
        System.out.println("Surface (200*300) : " + rect.getSurface());

        rect = new Square();
        rect.setWidth(200);
        rect.setHeight(300);
        System.out.println("Surface (200*300) : " + rect.getSurface());
    }
}
