package ex_006_IncrementAndDecrementOperator;

public class Lab_071_Increment_Post {
  public static void main(String[] args) {
    int a = 10;
    System.out.println(++a); // This is pre-increment

    // Now post increment
    int b = 11;
    int c = b++;

    //ERT
    /*
    L no. / b / c
    9 / 11 /NA
    10 / 12 / 11

     */
    System.out.println(b);
    System.out.println(c);
  }
}
