import java.util.Random;
class RandomNumberThread extends Thread {
    public void run() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int randomNum = rand.nextInt(100); // Generate random number between 0 and 99
            System.out.println("Random Number: " + randomNum);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        RandomNumberThread thread1 = new RandomNumberThread();
        RandomNumberThread thread2 = new RandomNumberThread();
        
        thread1.start();
        thread2.start();
    }
}
