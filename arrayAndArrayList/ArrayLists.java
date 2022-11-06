package arrayAndArrayList;

import java.util.ArrayList;
import java.util.Collections;

// ArrayList is dynamic, it does not have a fixed size.
public class ArrayLists {

  public static void main(String[] args) {

    // 1. Creation of an ArrayList
    ArrayList<String> myarr = new ArrayList<>(); // the return type of ArrayList is String
    // ArrayList without value
    ArrayList<String> myarr2 = new ArrayList<>(10);
    // create an ArrayList with specific capacity

    // 2. Adding element into an empty ArrayList
    myarr.add("Tommy");
    myarr.add("Steve");
    myarr.add("Vincent");
    myarr.add(2, "Karson"); // adding element into the specific index
    System.out.println(myarr); // [Tommy, Steve, Karson, Vincent]
    // as the return type of ArrayList is String, so we can just simply print out
    // myarr
    // if the return type is an Object, we need to use the get method to print out,
    // othetwise we are only printing out the object address

    // 3. Method of ArrayList (List interface)
    // 3.1
    int x = myarr.size(); // get size, 4
    System.out.println(x);

    System.out.println(myarr.get(3)); // print Vincent
    // get the values of index 3

    // 3.2 Remove element
    myarr.remove(0); // remove "Tommy"
    System.out.println(myarr); // print [Steve, Karson, Vincent]

    // 3.3
    for (String elements : myarr) {
      if (myarr.isEmpty()) { // check if the list contains no elements
        System.out.println("Empty");
      }
      System.out.println(elements + " ");
    } // print Steve, Karson, Vincent

    // 3.4 Check the index of the element
    int r = myarr.indexOf("Karson"); // return 1
    int w = myarr.indexOf("Steve"); // return 0

    // further action, swapping with specific elements
    System.out.println("Before swapping : " + myarr);
    Collections.swap(myarr, w, r); // swap the position of "Karson" and "Steve"
    System.out.println("After swapping : " + myarr);

    // 3.5 Sorting by Collection.sort
    /*
     * ArrayList implements the interface of List. As List extends the interface of
     * Collections,
     * ArrayList can also implements the method in Collections. Chapter in
     * Collections will further introduce.
     */
    ArrayList<Integer> myarr3 = new ArrayList<>();
    myarr3.add(5);
    myarr3.add(4);
    myarr3.add(2);
    myarr3.add(1);
    myarr3.add(3);
    myarr3.add(0);
    Collections.sort(myarr3); // method to sort the List in an ascending order
    System.out.println(myarr3);
    Collections.reverse(myarr3);// method to sort the List in an descending order
    System.out.println(myarr3);

    /*
     * Question: What if we want to sort the List depending on the other elements?
     * Example: We want to sort the List according to the Date of Birth
     * ("Peter", 1991,1,2, "Steve", 1980,3,4, "Paul", 1999,7,1)
     ** 
     * The Collection.sort can only compare the single elements, thus we need the
     * help from Comparable here.
     * Continue in the Chapter of Comparator and Comparable.
     */

    // 3.6 Methods that need to compare another array
    myarr.equals(myarr2); // print false , the method of equals returns a Boolean Type
    // check whether the elements of one ArrayList equal to another
    // System.out.println(myarr3.lastIndexOf(x)); wrong output

    /*
     * Situation: I want to update the elements of myarr3, some numbers is required
     * to be deleted.
     */
    ArrayList<Integer> elementsToRemoved = new ArrayList<>();
    elementsToRemoved.add(1);
    elementsToRemoved.add(3);
    elementsToRemoved.add(5);
    // creating a new ArrayList instantiating the numbers to be deleted

    myarr3.removeAll(elementsToRemoved); // remove numbers in myarr3
    System.out.println(myarr3); // print [4, 2, 0]

    System.out.println(myarr3.contains(3)); // print false if it is not
    // Check whether the 3 is in the ArrayList

  }
}
