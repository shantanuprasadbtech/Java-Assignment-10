# Java-Assignment-10

ThreadCreation Java Program

This program demonstrates the creation of a thread and the use of several methods available in the Thread class.

Thread Creation

To create a thread, create a class that extends the Thread class. This will override the run method, which is the entry point for the thread. In this case, the run methodprints out a message to indicate that the thread is running.

To start the thread, create an instance of the Main class and call the start method. This will execute the run method in a separate thread.


Thread Synchronization
Use the join method to wait for the thread to finish before continuing. This method blocks the calling thread until the specified thread completes.


Thread Status
Several methods exist to check the status of the thread, including:

isAlive: This method returns true if the thread is still running.
getName and setName: These methods get and set the name of the thread.
getPriority and setPriority: These methods get and set the priority of the thread.
getState: This method returns the current state of the thread, such as NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, or TERMINATED.
