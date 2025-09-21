package ex_001_Java_Basics;

public class Lab_009_ChatGPT_PrintCommands {
  public static void main(String[] args) {
    // Call each method
    examplePrintln();
    examplePrint();
    examplePrintf();
  }

  // Example for println
  public static void examplePrintln() {
    System.out.println("=== println Example ===");
    System.out.println("Line 1 using println");
    System.out.println("Line 2 using println");
    System.out.println("Line 3 using println");
    System.out.println(); // extra line for spacing
  }

  // Example for print
  public static void examplePrint() {
    System.out.println("=== print Example ===");
    System.out.print("This is first part. ");
    System.out.print("This is second part. ");
    System.out.print("This is third part.");
    System.out.println("\n"); // to move to next line after prints
  }

  // Example for printf
  public static void examplePrintf() {
    System.out.println("=== printf Example ===");
    int age1 = 25;
    int age2 = 30;
    int age3 = 35;
    String name1 = "Vincent";
    String name2 = "John";
    String name3 = "Sarah";

    // Printing 3 lines with formatting
    System.out.printf("My name is %s and I am %d years old\n", name1, age1);
    System.out.printf("My name is %s and I am %d years old\n", name2, age2);
    System.out.printf("My name is %s and I am %d years old\n", name3, age3);
  }
}
