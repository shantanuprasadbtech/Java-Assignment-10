public class ThreadCreation extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        ThreadCreation thread = new ThreadCreation();
        thread.start(); // Start the thread

        // Wait for the thread to finish
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if the thread is alive
        System.out.println("Thread is alive: " + thread.isAlive());

        // Set the thread name
        thread.setName("MyThread");

        // Get the thread name
        System.out.println("Thread name: " + thread.getName());

        // Get the thread priority
        System.out.println("Thread priority: " + thread.getPriority());

        // Set the thread priority
        thread.setPriority(Thread.MAX_PRIORITY);

        // Get the thread state
        System.out.println("Thread state: " + thread.getState());
    }
}
