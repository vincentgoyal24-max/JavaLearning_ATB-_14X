package ex_004_TypeCasting;

public class Lab_058_TypeCasting_NarrowingReiterate {
  public static void main(String[] args) {
    long l = 1234567890l;
   // short s= l; // this is implicit
    short s2 = (short) l; // this is explicit
    //System.out.println(s);
    System.out.println(s2);
  }
}
