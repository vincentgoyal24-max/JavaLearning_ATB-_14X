package ex_005_Ternary_Operators;

public class Lab_067_TernaryOperator_WhichIsMaxNumber {
  public static void main(String[] args) {

    // Interview - Zeta → (AT) Ter nested → Max between 3 numbers →
    // int n1 = 2; int n2 = 9;  int n3 = -11;

    int n1 = 2;
    int n2 = 9;
    int n3 = -11;

    // Logic Building Formula

    /*Step 1 - Find the input and output data types
     input = n1, n2, n3
     output = int - max number or string - message showing max number

     Step 2 - Rough Logic
      n1 > n2 && n1 > n3 -> n1
      n2 > n1 && n2 > n3 -> n2
      n3 > n1 && n3 > n2 -> n3

      Step 3 - Dry run
     */

    int max = n1 > n2 && n1 > n3 ? n1 : n2 > n1 && n2 > n3 ? n2 : n3;
    System.out.printf("max number is %d", max);



  }
}
