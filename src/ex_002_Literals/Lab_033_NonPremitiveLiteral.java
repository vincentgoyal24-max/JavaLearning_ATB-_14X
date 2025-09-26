package ex_002_Literals;

import java.util.Arrays;
public class Lab_033_NonPremitiveLiteral {
  public static void main(String[] args) {
    String name = "Vincent"; // String is bunch of characters
    System.out.println(name);
    int[] array = {1,2,3,4,5};
    System.out.println(Arrays.toString(array));

//    Non premitive data types are those which can further be broken down into smaller parts
//    String is a non premitive data type

    /*
    Why we used Arrays.toString(array) instead of println(array)
    Earlier we used println(array) to print the array but it will not print the array elements
    It will print the memory address of the array, in output it was showing [I@1b6d3586\

    So, on checking with ChatGPT, it said that we can use Arrays.toString(array) to print the array elements
    First of all we need to import java.util.Arrays;
    Then we can use Arrays.toString(array) to print the array elements.
     */

  }
}
