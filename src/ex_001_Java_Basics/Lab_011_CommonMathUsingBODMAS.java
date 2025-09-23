package ex_001_Java_Basics;

public class Lab_011_CommonMathUsingBODMAS {
  public static void main(String[] args) {
    System.out.println(10+3/2-1*5);
  }
}
/*just for knowledge, how BODMAS works

Evaluate 3/2 first (division, integer division):
3/2 = 1

Expression becomes: 10 + 1 - 1*5

Next evaluate 1*5 (multiplication):
1 * 5 = 5

Expression becomes: 10 + 1 - 5

Now do addition/subtraction left-to-right:
10 + 1 = 11
11 - 5 = 6

Final result printed by the program: 6

 */