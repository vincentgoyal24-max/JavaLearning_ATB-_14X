package ex_003_Operators;

public class Lab_041_Interview_Concat_Plus {
  public static void main(String[] args) {
    // + > it is a
    int a = 10;
    int b = 20;
    System.out.println(a+b);

    String firstName = "Vincent";
    String lastname = "Goyal";
    System.out.println(firstName+lastname);

    // + > it behaves differently when used with string
    // + > it is also called operator overloading
    // "-, *, /"  > it is not supported > reason is Java rules.



// Interview Question
    System.out.println(firstName+lastname+a+b);
    System.out.println((firstName+lastname)+(a+b));
    System.out.println(firstName+(lastname+a+b));
    System.out.println((firstName+lastname+a)+b);

  }
}
