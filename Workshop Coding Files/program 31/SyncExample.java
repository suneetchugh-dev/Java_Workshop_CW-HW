class SharedResource {
    // Synchronized method
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    // Method with synchronized block
    void printMessage(String msg) {
        System.out.println("Non-synchronized part: " + msg);

        // Critical section
        synchronized (this) {
            for (int i = 1; i <= 3; i++) {
                System.out.println(msg + " - " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}

// Thread class
class MyThread extends Thread {
    SharedResource resource;
    int num;
    String message;

    MyThread(SharedResource r, int n, String msg) {
        resource = r;
        num = n;
        message = msg;
    }

    public void run() {
        resource.printTable(num);  // synchronized method
        resource.printMessage(message); // synchronized block
    }
}

// Main class
public class SyncExample {
    public static void main(String args[]) {
        SharedResource obj = new SharedResource();

        MyThread t1 = new MyThread(obj, 5, "Hello");
        MyThread t2 = new MyThread(obj, 100, "World");

        t1.start();
        t2.start();
    }
}