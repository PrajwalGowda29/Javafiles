interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

// Rectangle class implementing Resizable
class Rectangle implements Resizable {
    private int width;
    private int height;

    // Constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Implement resizeWidth method
    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }

    // Implement resizeHeight method
    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }

    // Method to display rectangle dimensions
    public void display() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        rect.display();

        rect.resizeWidth(30);
        rect.resizeHeight(40);
        rect.display();
    }
}
