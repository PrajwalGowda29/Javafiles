class MyRunnable implements Runnable {

    String threadName;

    MyRunnable(String name) {
        threadName = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " is running : " + i);
                Thread.sleep(500);   // Suspend thread for 500 milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " interrupted");
        }
    }
}

public class RunnableThreadDemo {
    public static void main(String[] args) {

        MyRunnable r1 = new MyRunnable("Thread-1");
        MyRunnable r2 = new MyRunnable("Thread-2");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        // Start the newly created threads
        t1.start();
        t2.start();
    }
}
