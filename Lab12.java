class MyThread extends Thread {

    // Constructor
    MyThread(String name) {
        super(name);   // Call to base class (Thread) constructor
        start();       // Start the thread
    }

    // run method
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Child Thread: " + getName() + " - Count: " + i);
                Thread.sleep(500); // Pause for 500 milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted");
        }
    }
}

public class MainThreadDemo {

    public static void main(String[] args) {
        // Create child thread
        MyThread t1 = new MyThread("MyThread");

        // Main thread execution
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Main Thread - Count: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread completed");
    }
}
