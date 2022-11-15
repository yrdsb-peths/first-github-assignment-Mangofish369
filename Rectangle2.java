public class Rectangle
{
    // instance variables
    private int width;
    private int height;
    
    //constructors
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }
    
    //Instance method
    public int getArea()
    {
        return width * height;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    //String return
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}
