package flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class flatMapExample {

  public static void main(String[] args) {

    List<Integer> even = Arrays.asList(2, 4, 6, 8, 10); // list of even number
    List<Integer> odd = Arrays.asList(3, 5, 7, 9, 11); // list of odd number
    List<Integer> primes = Arrays.asList(17, 19, 23, 29, 31); // list of primes number

    // list of numbers
    List<List<Integer>> listOfNumbers = new ArrayList<>();
    listOfNumbers.add(even);
    listOfNumbers.add(odd);
    listOfNumbers.add(primes);

    System.out.println("list of numbers: " + listOfNumbers);

  }

}
