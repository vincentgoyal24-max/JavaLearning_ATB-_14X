package ex_003_Operators;

public class Lab_039_Relational_Operator {
  public static void main(String[] args) {
     //     < Less Than
    //      < =  -> Less than or equal to
    //      > Greater
    //      > = Greater or equal
    //      == ->  Equal to (but checking)
    //      != -> Not equal

    int a = 20;
    int b = 30;
    boolean c = a > b;
    System.out.println(c);

    int ageVincent = 30;
    int ageJohn = 30;
    boolean age = ageVincent >= ageJohn;
    System.out.println(age);
  }
}
