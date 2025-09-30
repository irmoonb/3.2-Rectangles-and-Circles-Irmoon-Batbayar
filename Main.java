public class Main {
    public static void main(String[] args)
    {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(67, 67, 67, 69);
        Rectangle rect3 = new Rectangle(100, 100, 90, 150);

        rect1.display();
        rect2.display();
        rect3.display();

        // Circles
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(67, 67, 67);
        Circle circle3 = new Circle(100, 90, 150);

        circle1.display();
        circle2.display();
        circle3.display();
    }
}
