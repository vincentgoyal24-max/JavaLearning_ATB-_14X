package ex_001_Java_Basics;

public class Lab_012_Identifiers {
  public static void main(String[] args) {

    String point_1 = "1. Identifiers are the names given to variables, methods, classes, interfaces, etc.";
    String point_2 = "2. Identifiers can be started with a symbol, $ or _";
    String point_3 = "3. Identifiers can be in lower_case or upper_case";
    String point_4 = "4. Identifiers can Not start with a number";
    String point_5 = "5. Identifiers can be Alphanumeric.";

    System.out.println(point_1);
    System.out.println(point_2);
    System.out.println(point_3);
    System.out.println(point_4);
    System.out.println(point_5);
  }
}
// All are fine (ABC123, _abc123, $abc123, abc123) except 123abc.
// Only "_" can be written but it is not recommended to use it as it can not be run.
