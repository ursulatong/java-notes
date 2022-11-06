package arrayAndArrayList;

import java.util.Arrays;
import java.util.Collections;

// Array is static 
public class Array {

  public static void main(String[] args) {

    // 1. Two ways to create an Array

    int[] arr = new int[5]; // index from 0
    // declare an array has 5 index which is fixed
    // without value, default 0

    System.out.println(arr[0]); // print 0
    System.out.println(arr[1]); // print 0
    // print out single value of specific index

    for (int element : arr) {
      System.out.print(element + ","); // print (0,0,0,0,0,0)
    }

    // print out all elements of an array

    // 1.1 second way to create an Array

    int[] arr2 = { 1, 2, 3, 4, 5 };
    // fix size of value
    // with value assigned to the array

    // 1.2 Assign value
    arr2[0] = 2;
    arr2[1] = 3;
    arr2[2] = 4;

    // 2. Filling an Array
    Arrays.fill(arr, 1); // only fill a specific value to all elements
    System.out.println(Arrays.toString(arr)); // print [1, 1, 1, 1, 1]

    // 3. Copying an Array
    int[] arr3 = Arrays.copyOf(arr2, arr2.length);
    System.out.println(Arrays.toString(arr3)); // print [1, 2, 3, 4, 5]

    // 4. Comparsion for equality
    System.out.println(arr2 == arr3); // print false as == is comparing the object reference
    System.out.println(arr2.equals(arr3)); // print false as arr2 this object does not equal to arr3
    System.out.println(Arrays.equals(arr2, arr3)); // print true, checking the elements of each array

    // 5. Sorting in ascending order
    int[] arr4 = { 15, 118, 35, 29, 174, 109 };
    Arrays.sort(arr4);
    System.out.println(Arrays.toString(arr4)); // [15, 29, 35, 109, 118, 174]

    Integer[] arr5 = { 15, 118, 35, 29, 174, 109 };
    Arrays.sort(arr5, Collections.reverseOrder()); // [174, 118, 109, 35, 29, 15]
    System.out.println(Arrays.toString(arr5));
    // sort in ascending first then use Collections.reverseOrder method

    // 6. search the position of key
    // Arrays.binarySearch()
    char vowels[] = { 'a', 'e', 'i', 'o', 'u' };

    char key = 'i';
    int startIndex = 2;
    int endIndex = 4;

    System.out.println(Arrays.binarySearch(vowels, startIndex, endIndex, key)); // print 2

    // 6.1
    char charToFind = 'o';
    {
      for (int i = 0; i < vowels.length; i++) {
        if (vowels[i] == charToFind) {
          System.out.printf("Found %s at index %s\n", charToFind, i); // print Found o at index 3
          break;
        }
      }
      // the %s is a 'format character', indicating "insert a string here"
      System.out.println(Arrays.binarySearch(vowels, charToFind)); // print 3

    }

  }
}
