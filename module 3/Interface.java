// Create an Interface
interface Polygon {
    void getArea(int length, int breadth);
}

// Implement the Polygon interface
class Rectangle implements Polygon {

    // Implementation of abstract method
    @Override
    public void getArea(int length, int breadth) {
        System.out.println("The Area of Rectangle is: " + (length * breadth));
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.getArea(5, 6); // Example usage
    }
}
