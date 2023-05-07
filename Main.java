public class Main extends Thread{
        public void run() {
            System.out.println("Thread is running.");
        }

        public static void main(String[] args) {
            Main thread = new Main();
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
            thread.setName("Test Thread");

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
