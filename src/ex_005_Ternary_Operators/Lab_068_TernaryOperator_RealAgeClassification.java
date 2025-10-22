package ex_005_Ternary_Operators;

import java.util.Scanner;

public class Lab_068_TernaryOperator_RealAgeClassification {
  public static void main(String[] args) {

    //Real_Age_Classification (  age → 59 ) →  Minor, Adult (Adult , Sr Senior) - Ternary Operator

    /*
    String a1 = args[0];
    String a2 = args[1];

    System.out.println(a1);
    System.out.println(a2);
    */


    /*int minor < 18;
    int adlut =< 58;
    int senior => 59;*/

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your age");
    int age = scanner.nextInt();

    String result = age < 0 ? "Age should be more than 0" : age < 18 ? "minor" : age <= 58 ? "adult" : "senior";
    System.out.println(result);

  }
}
