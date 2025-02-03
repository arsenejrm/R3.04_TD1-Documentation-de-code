package LSP;

/**
 * This class allows to define a square using his height or width. It extends from Rectangle class.
 */
public class Square extends Rectangle{

    /**
     * This method sets the height of the current Square. It has the same effect as setWidth().
     * @param height Integer equals to the new height of the current Square.
     */
    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    /**
     * This method sets the size of the current Square. It has the same effect as setHeight().
     * @param width Integer equals to the new width of the current Square.
     */
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }
}
