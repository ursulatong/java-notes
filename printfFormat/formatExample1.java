package printfFormat;

import java.util.Scanner;


/*
Expected Output
================================
java           100
cpp            065
python         050
================================
*/

public class formatExample1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("================================");
    for (int i = 0; i < 3; i++) {
      String s1 = sc.next();
      int x = sc.nextInt();
      System.out.printf("%-15s", s1);
      System.out.printf("%03d%n", x);

    }
    System.out.println("================================");

  }
}
