package variables;

public class Vehicles {

  // static variables
  // static variables share the same variables to the whole class, which means any
  // changes relating to this variables will change its original value
  private static int speed = 100;

  static { // static block always execute first
    System.out.println(speed); // print 100
  }

  public Vehicles(int speed) {
    this.speed = speed;
  }

  public int getSpeed(int speed) {
    return speed;
  }

  public static void main(String[] args) {

    // instance variable
    speed = 200; // pass by value
    speed = 300; // a new value will be passed into the static variables and cover its original
                 // value
    System.out.println(speed); // print 300
    System.out.println(Vehicles.speed); // print 300, static varibles can be called by the class itself

    // declare two new object, toyota's speed = 20, benz's speed = 100
    Vehicles toyota = new Vehicles(20);
    Vehicles benz = new Vehicles(100);

    System.out.println(toyota.speed); // print 100
    // that's not what we want! We want "toyota's speed = 20, benz's speed = 100".

    System.out.println(toyota.getSpeed(speed)); // print 100
    /*
     * even we want to get the speed of 20 by getSpeed method, we cannot get 20.
     * Aren't we just create a new
     * object and pass the speed of 20 into it? Yes, however the variable speed is
     * static, it is shared by all
     * objects of this class, any new changes of this variable will cover the
     * original value.
     */

  }

}
