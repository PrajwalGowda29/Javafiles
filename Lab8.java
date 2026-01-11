class Outer {

    // Outer class display method
    void display() {
        System.out.println("This is the display method of the Outer class.");
    }

    // Inner class
    class Inner {

        // Inner class display method
        void display() {
            System.out.println("This is the display method of the Inner class.");
        }
    }
}

public class MainClass {
    public static void main(String[] args) {

        // Create object of Outer class
        Outer outer = new Outer();
        outer.display();

        // Create object of Inner class using Outer class object
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}
