package ex_004_TypeCasting;

public class Lab_057_TypeCasting_Narrowing {
  public static void main(String[] args) {
    int i = 300;

    //byte b = i; /* this is implicit >  this is know as narrowing, going from bigger bucket to smaller bucket
    // this is not valid syntax
    byte b = (byte) i; // this is valid syntax > explicit > narrowing > not automatically done
    System.out.println(b);



  }
}
