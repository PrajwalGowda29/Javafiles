package mypack;

public class MyOperations {

    public void displayMessage() {
        System.out.println("Welcome to mypack package!");
    }

    public int add(int a, int b) {
        return a + b;
    }
}


//Import and Implement the Package in Another Class  PackageDemo.java
import mypack.MyOperations;

public class PackageDemo {

    public static void main(String[] args) {

        MyOperations obj = new MyOperations();

        obj.displayMessage();

        int result = obj.add(10, 20);
        System.out.println("Sum = " + result);
    }
}
