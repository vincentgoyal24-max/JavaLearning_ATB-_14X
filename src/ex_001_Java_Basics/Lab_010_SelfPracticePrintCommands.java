package ex_001_Java_Basics;

public class Lab_010_SelfPracticePrintCommands {
  public static void main(String[] args) {
    example_println();
    example_print();
    example_printf();
  }
    //    Println command practice;
    public static void example_println () {
      System.out.println("This is first line");
      System.out.println("This is Second line");
      System.out.println("This is third line +");
    }
    public static void example_print () {
      System.out.print("This is first line. + ");
      System.out.print("This is Second line. + ");
      System.out.print("This is third line. \n");
    }
    public static void example_printf () {
      int age1 = 30;
      int age2 = 40;
      String name1 = "Vincent";
      String name2 = "John";
      System.out.printf("My age is %d and my name is %s\n", age1, name1);
      System.out.printf("My age is %d and my name is %s", age2, name2);
    }
}
