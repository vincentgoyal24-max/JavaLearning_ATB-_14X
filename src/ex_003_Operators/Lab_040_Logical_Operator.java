package ex_003_Operators;

public class Lab_040_Logical_Operator {
  public static void main(String[] args) {
    boolean a = true;
        System.out.println(!a); // ! > Not operator

        boolean b = true;
        System.out.println(!!b); // !! > Not operator

        boolean c= true || false; // || > OR operator

        System.out.println(c);

        boolean c1= false && true; // && > AND operator
        System.out.println(c1);
  }
}
