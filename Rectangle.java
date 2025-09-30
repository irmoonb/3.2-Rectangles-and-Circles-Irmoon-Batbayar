public class Rectangle
{
    private int x;
    private int y;
    private int width;
    private int height;

    // Constructors
    public Rectangle()
    {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Methods

    public int getPermimeter()
    {
        return 2 * (width + height);
    }

    public int getArea()
    {
        return width * height;
    }

    public void display()
    {
        System.out.println("Rectangle @ (" + x + ", " + y + "), width = " + width + ", height = " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPermimeter());
        System.out.println("Circumference: " + getArea());    }
}
