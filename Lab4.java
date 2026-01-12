public class MyPoint {
    // Instance variables
    private int x;
    private int y;

    // Default constructor (0,0)
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Overloaded constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Setter method for x and y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter method that returns x and y as array
    public int[] getXY() {
        return new int[] { x, y };
    }

    // toString method
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";a
    }

    // Distance from this point to (x, y)
    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Distance from this point to another MyPoint
    public double distance(MyPoint another) {
        int dx = this.x - another.x;
        int dy = this.y - another.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Distance from this point to origin (0,0)
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
}


public class TestMyPoint {
    public static void main(String[] args) {

        // Test default constructor
        MyPoint p1 = new MyPoint();
        System.out.println("Point p1: " + p1.toString());

        // Test overloaded constructor
        MyPoint p2 = new MyPoint(3, 4);
        System.out.println("Point p2: " + p2);

        // Test setXY()
        p1.setXY(6, 8);
        System.out.println("After setting p1: " + p1);

        // Test getXY()
        int[] coords = p1.getXY();
        System.out.println("p1 coordinates from getXY(): (" + coords[0] + ", " + coords[1] + ")");

        // Test distance(int x, int y)
        System.out.println("Distance p1 to (0,0): " + p1.distance(0, 0));

        // Test distance(MyPoint another)
        System.out.println("Distance between p1 and p2: " + p1.distance(p2));

        // Test distance() to origin
        System.out.println("Distance p2 to origin: " + p2.distance());
    }
}

