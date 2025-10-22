package ex_004_TypeCasting;

public class Lab_056_TypeCasting_01 {
  public static void main(String[] args) {
    byte b = 10;
    int i = b; //valid syntax > implicit > widening > automatically done

    // int i2 = int b; // valid syntax > explicit > narrowing > not automatically done
  }
}
