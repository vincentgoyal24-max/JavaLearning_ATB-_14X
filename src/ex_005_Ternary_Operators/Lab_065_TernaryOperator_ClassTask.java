package ex_005_Ternary_Operators;

public class Lab_065_TernaryOperator_ClassTask {
  public static void main(String[] args) {

    // check if the number is even or odd
    int number = 22;
    String result = number%2==0 ? "Even" : "Odd";
    System.out.println(result);

    // check if the number is positive or negative
    int number1 = 22;
    String result1 = number1>0 ? "Positive" : "Negative";
    System.out.println(result1);
  }
}
