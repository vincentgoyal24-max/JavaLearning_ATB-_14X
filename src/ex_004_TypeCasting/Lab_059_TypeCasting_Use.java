package ex_004_TypeCasting;

public class Lab_059_TypeCasting_Use {
  public static void main(String[] args) {
    int course = 100;
    float GST = 18.45f;
    float total = course*GST/100; // this is valid syntax > explicit > bucket is already big
    System.out.println(total);

    /* int course = 100;
    float GST = 18.45f;
    int total1 = course*GST/100; // this is invalid syntax > implicit > bucket is smaller as compared to float
    int total1 = course*(int)GST/100; // this is valid syntax > EXPLICIT >
    System.out.println(total1);
    */
  }
}
