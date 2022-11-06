package thread;

public class Class {

  public static void main(String[] args) throws InterruptedException {

    // 1. Check how many thread
    Thread.activeCount();
    System.out.println(Thread.activeCount()); // print 1

    // 2. return the name of the thread
    Thread.currentThread().getName();
    System.out.println(Thread.currentThread().getName()); // print main

    // 3. Set the name of the thread
    Thread.currentThread().setName("CLASSSSS");
    System.out.println(Thread.currentThread().getName()); // print CLASSSSS

    // 4. Check the priority of the main thread in running
    Thread.currentThread().getPriority();
    System.out.println(Thread.currentThread().getPriority()); // print 5 (in scale from 1 to 10)

    // 5. Change the priority of the main thread
    Thread.currentThread().setPriority(10); // 10 is the highest priority
    System.out.println(Thread.currentThread().getPriority()); // print 10

    // 6. A thread sleep
    Thread.currentThread().isAlive();
    System.out.println(Thread.currentThread().isAlive()); // print true

    // 7. Pause the thread
    for (int i = 3; i > 0; i--) { // set a count down at 3
      System.out.println(i); // print 3,2,1
      Thread.sleep(1000); // pause 1s
    }
    System.out.println("Game Over!");

    Mythread thread2 = new Mythread();
    thread2.start();
    System.out.println(thread2.isAlive()); // return false, why?

    System.out.println(thread2.getName());

  }
}
