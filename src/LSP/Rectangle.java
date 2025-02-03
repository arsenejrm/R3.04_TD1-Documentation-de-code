package LSP;

/**
 * This class allows to define a rectangle using his height and width, to get and set each and to calculate his surface.
 */
public class Rectangle {
    private int height;
    private int width;

    /**
     * This method return height of the current Rectangle.
     * IMPORTANT : Make sure to first set a height with setHeight() before getting it.
     * @return Integer equals to height of the current Rectangle.
     */
    public int getHeight() {
        return height;
    }

    /**
     * This method sets the height of the current Rectangle.
     * @param height Integer equals to the new height of the current Rectangle
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * This method return width of the current Rectangle.
     * IMPORTANT : Make sure to first set a width with setWidth() before getting it.
     * @return Integer equals to width of the current Rectangle.
     */
    public int getWidth() {
        return width;
    }

    /**
     * This method sets the width of the current Rectangle.
     * @param width Integer equals to the new width of the current Rectangle
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * This method calculates the surface of the current Rectangle by multiplicate height with width.
     * IMPORTANT : Make sure to first set width and height using setWidth() and setHeight() of the current Rectangle before using this method.
     * @return Integer equals to the surface of the current Rectangle
     */
    public int getSurface() {
        return this.height * this.width;
    }
}
