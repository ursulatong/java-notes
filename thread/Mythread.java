package thread;

public class Mythread extends Thread {
  @Override
  public void run() {
    System.out.println("This Thread is running!");
  }
}