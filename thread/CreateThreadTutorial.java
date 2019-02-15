
package thread;

//If your class is intended to be executed as a thread then you can achieve this by implementing a Runnable interface.
//You will need to follow three basic steps −

//Step 1
//As a first step, you need to implement a run() method provided by a Runnable interface. 
//This method provides an entry point for the thread and you will put your complete business logic inside this method. 
//Following is a simple syntax of the run() method −
//public void run( )

//Step 2
//As a second step, you will instantiate a Thread object using the following constructor −
//Thread(Runnable threadObj, String threadName);
//Where, threadObj is an instance of a class that implements the Runnable interface and threadName is the name given to the new thread.

//Step 3
//Once a Thread object is created, you can start it by calling start() method, which executes a call to run( ) method. 
//Following is a simple syntax of start() method −
//void start();



public class CreateThreadTutorial {

   public static void main(String args[]) {
      RunnableDemo R1 = new RunnableDemo( "Thread-1");
      R1.start();
      
      RunnableDemo R2 = new RunnableDemo( "Thread-2");
      R2.start();
   }   
}

class RunnableDemo implements Runnable {
   private Thread t;
   private String threadName;
   
   RunnableDemo( String name) {
      threadName = name;
      System.out.println("Creating " +  threadName );
   }
   
   public void run() {
      System.out.println("Running " +  threadName );
      try {
         for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
            // Let the thread sleep for a while.
            Thread.sleep(50);
         }
      } catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
      }
      System.out.println("Thread " +  threadName + " exiting.");
   }
   
   public void start () {
      System.out.println("Starting " +  threadName );
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
   
   //output
  // Creating Thread-1
//Starting Thread-1
//Creating Thread-2
//Starting Thread-2
//Running Thread-1
//Thread: Thread-1, 4
//Running Thread-2
//Thread: Thread-2, 4
//Thread: Thread-1, 3
//Thread: Thread-2, 3
//Thread: Thread-1, 2
//Thread: Thread-2, 2
//Thread: Thread-1, 1
//Thread: Thread-2, 1
//Thread Thread-1 exiting.
//Thread Thread-2 exiting.
}


