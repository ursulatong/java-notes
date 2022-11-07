package variables;

public class NonStaticVehicles {

  // non static variables
  private int speed = 100;

  public NonStaticVehicles(int speed) {
    this.speed = speed;
  }

  public static void main(String[] args) {

    // speed = 500;
    // error, Cannot make a static reference to the non-static field speed

    // instance variables
    NonStaticVehicles toyota = new NonStaticVehicles(200);
    NonStaticVehicles benz = new NonStaticVehicles(300);

    System.out.println(toyota.speed); // print 200
    System.out.println(benz.speed); // print 300

    // System.out.println(NonStaticVehicles.speed);
    // error, Cannot make a static reference to the non-static field
    // NonStaticVehicles.speed
  }
}
