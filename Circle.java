public class Circle
{
    private int x;
    private int y;
    private int radius;
    private final double PI = 3.1;

    // Constructors
    public Circle()
    {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    public Circle(int x, int y, int radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Methods

    public double getPerimeter()
    {
        return 2 * PI * radius;
    }

    public double getArea()
    {
        return PI * radius * radius;
    }

    public void display()
    {
        System.out.println("Circle @ (" + x + ", " + y + "), radius = " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Circumference: " + getPerimeter());
    }
}
