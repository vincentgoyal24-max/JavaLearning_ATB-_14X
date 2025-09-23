package ex_001_Java_Basics;

public class Lab_017_Variabels {
  public static void main(String[] args) {

//    Syntax for variable
    // dataType variable_name = variable_value;

    byte age_darwin = 29;

    /*
    byte = dataType.
    age_darwin = variable_name, it is also called identifier
    = > it is known as Assignment operator.
    29 = variable_value, it is also called literal

     */
    short age_vincent =30;
//    Same variable cannot be used again in the same scope or program.
    age_darwin = 111;
    System.out.println(age_darwin);


  }
}