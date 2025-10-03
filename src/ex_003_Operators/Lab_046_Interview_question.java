package ex_003_Operators;

public class Lab_046_Interview_question {
  public static void main(String[] args) {
    int balaji_salary = 12;
        boolean b = !(balaji_salary > 10 || balaji_salary < 5);
        System.out.println(b);

        // Divide and Conquer!

        // A -> balaji_salary > 10 -> 12 > 10 -> true
        // B -> balaji_salary < 5 -> 12 <5 -> false
        // (A || B) -> TRUE
        // !(true) -> False



  }
}
