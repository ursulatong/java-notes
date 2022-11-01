package com.vtxlab.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Array is static 
public class Array {

  public static void main(String[] args) {

    // 1. Two ways to create an Array

    int[] arr = new int[5];
    // declare an array has 5 index which is fixed
    // without value, default 0

    System.out.println(arr[0]); // print 0
    System.out.println(arr[1]); // print 0
    // print out single value of specific index

    for (int element : arr) {
      System.out.print(element); // print (0,0,0,0,0)
    }
    // print out all elements of an array

    // 1.1 second way to create an Array

    int[] arr2 = new int[] { 1, 2, 3, 4, 5 };
    // fix size of value
    // with value assigned to the array

    for (int i = 0; i <= arr2.length; i++) {
      System.out.println(i);
    }
    // print all value in the array // print 1,2,3,4,5

    // 2. Adding elements in the array
    arr[0] = 2;
    arr[1] = 3;
    arr[2] = 4;

    for (int element : arr) {
      System.out.print(element); // print (2,3,4,0,0)
    }

    arr2[0] = 2;
    arr2[1] = 3;

    for (int element : arr2) {
      System.out.println(element); // print (2,3,3,4,5)
    }

    /*
     * // 4. How to sort an Array wtih for loops
     * // insertion sort
     * // Reverse the element of int[] arr2 = new int[] { 1, 2, 3, 4, 5 };
     * int i, j, temp; // 2,1,3,4,5 //2,3,1,4,5 // 2,3,4,1,5 // 2,3,4,5,1
     * // 3,2,4,5,1 //
     * 
     * for (i = 0; i < arr2.length - 1; i++) { // 1
     * for (j = 1; j < arr2.length - 1; j++) {
     * if (arr2[j] > arr2[j - 1]) {
     * temp = arr2[j - 1]; //
     * arr2[j - 1] = arr2[j]; //
     * arr2[j] = temp; //
     * j++;
     * }
     * }
     * }
     * 
     * for (int myarr : arr2) {
     * System.out.print(myarr);
     * }
     */

    // bubble sort

    // 5. Transform an Array into a ArrayList

    // List<Integer> arrList2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    // Arrays to List method
    // System.out.println(arrList2.toString()); // print [1,2,3,4,5]

    // Wrong method to transform Array to ArrayList
    /*
     * int[] arr3 = new int[] { 1, 2, 3, 4, 5 };
     * List<Integer> arrList = new ArrayList<>();
     * // create an empty ArrayList
     * for (int element : arr3) {
     * arrList.add(element); // cannot add element into an ArrayList while looping
     * }
     * /*
     */

    // to be contiue...
    // ArrayList
  }
}
