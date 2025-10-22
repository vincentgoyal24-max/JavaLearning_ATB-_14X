package ex_005_Ternary_Operators;

import java.util.Scanner;

public class Lab_063_TernaryOperator_InterviewReadyQuestion {
  public static void main(String[] args) {
    //int age = 30;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your age");
    int age = scanner.nextInt();
    // Nested Ternary Operator
    // 2 conditions > result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
    String result = age >= 30 ? (age > 30 ? "you can go to goa and can drink" : "you can go goa but cant drink") : "You cannot go to " +
                                                                                                   "goa";
    System.out.println(result);
  }
}
