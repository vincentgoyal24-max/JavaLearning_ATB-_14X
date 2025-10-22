package ex_005_Ternary_Operators;

public class Lab_064_TernaryOperator_InterviewQuestion {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;

    // using ternary operator
    int max = x>y ? x : y;
    System.out.println(max);
    int max1 = x>y ? y : x;
    System.out.println(max1);
    int max3 = y>x ? x : y;
    System.out.println(max3);
    int max4 = y>x ? y : x;
    System.out.println(max4);

  }
}

/*
 Doubt session >
 why 20 ?
 x>y ? x : y; 20
 y>x ? y : x; 20
 y>x ? x : y; 10


// STILL NOT UNDERSTOOD


 */