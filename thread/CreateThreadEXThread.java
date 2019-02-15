
package thread;

 	

//public void start() Starts the thread in a separate path of execution, then invokes the run() method on this Thread object.
	

//public void run() If this Thread object was instantiated using a separate Runnable target, the run() method is invoked on that Runnable object.
	

//public final void setName(String name) Changes the name of the Thread object. There is also a getName() method for retrieving the name.
	

//public final void setPriority(int priority) Sets the priority of this Thread object. The possible values are between 1 and 10.
	

//public final void setDaemon(boolean on) A parameter of true denotes this Thread as a daemon thread.
 	

//public final void join(long millisec) The current thread invokes this method on a second thread, causing the current thread to block until the second thread terminates or the specified number of milliseconds passes.
	

//public void interrupt() Interrupts this thread, causing it to continue execution if it was blocked for any reason.
 	

//public final boolean isAlive() Returns true if the thread is alive, which is any time after the thread has been started but before it runs to completion.


//public static void yield() Causes the currently running thread to yield to any other threads of the same priority that are waiting to be scheduled.
 	

//public static void sleep(long millisec) Causes the currently running thread to block for at least the specified number of milliseconds.
 	

//public static boolean holdsLock(Object x) Returns true if the current thread holds the lock on the given Object.
 	

//public static Thread currentThread() Returns a reference to the currently running thread, which is the thread that invokes this method.
 	

//public static void dumpStack() Prints the stack trace for the currently running thread, which is useful when debugging a multithreaded application.


public class CreateThreadEXThread extends Thread {
   private int number;
   public CreateThreadEXThread(int number) {
      this.number = number;
   }
   
   public void run() {
      int counter = 0;
      int guess = 0;
      do {
         guess = (int) (Math.random() * 100 + 1);
         System.out.println(this.getName() + " guesses " + guess);
         counter++;
      } while(guess != number);
      System.out.println("** Correct!" + this.getName() + "in" + counter + "guesses.**");
   }
}
public class DisplayMessage implements Runnable {
   private String message;
   
   public DisplayMessage(String message) {
      this.message = message;
   }
   
   public void run() {
      while(true) {
         System.out.println(message);
      }
   }
}
public class ThreadClassDemo {

   public static void main(String [] args) {
      Runnable hello = new DisplayMessage("Hello");
      Thread thread1 = new Thread(hello);
      thread1.setDaemon(true);
      thread1.setName("hello");
      System.out.println("Starting hello thread...");
      thread1.start();
      
      Runnable bye = new DisplayMessage("Goodbye");
      Thread thread2 = new Thread(bye);
      thread2.setPriority(Thread.MIN_PRIORITY);
      thread2.setDaemon(true);
      System.out.println("Starting goodbye thread...");
      thread2.start();

      System.out.println("Starting thread3...");
      Thread thread3 = new CreateThreadEXThread(27);
      thread3.start();
      try {
         thread3.join();
      } catch (InterruptedException e) {
         System.out.println("Thread interrupted.");
      }
      System.out.println("Starting thread4...");
      Thread thread4 = new CreateThreadEXThread(75);
      
      thread4.start();
      System.out.println("main() is ending...");
   }
}
