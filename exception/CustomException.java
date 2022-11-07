package exception;

public class CustomException extends Exception {
  // CustomException is a checked exception now

  public CustomException() {

  }

  public static void test() {
    try {
      try {
        // if then else and other logic
        throw new CustomException(); // throwing checked exception
      } catch (CustomException e) {
        throw new Exception();
      }
    } catch (Exception e2) {
      int b = 0;
      System.out.println("byebye");
      return;
    } finally {
      System.out.println(" i am hungry");
    }
  }
}
