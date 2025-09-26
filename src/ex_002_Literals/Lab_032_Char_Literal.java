package ex_002_Literals;

public class Lab_032_Char_Literal {
  public static void main(String[] args) {
    char c = 'a';
//    in char literal we can use any single character A to Z or a to z or 0 to 9 or any special character !@#$%^&*()
//    char literal is always in single quote 'a'
    System.out.println(c);

    char c2 = '1';
    System.out.println(c2);

    char c3 = '!';
    System.out.println(c3);

    char c4 = 'A';
    System.out.println(c4);


// Escape Sequence

    char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("PramodDutta");
        System.out.println("Pramod"+new_line+"Dutta");
        System.out.println("Pramod\nDutta");
        System.out.println("Pramod"+tab_line+"Dutta");
        System.out.println("Pramod"+back_space+"Dutta");
        System.out.println( "Vincent"+carriage_return+"Goyal");

        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");

        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char ruppes = '₹';
        System.out.println(ruppes);

        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11  = '\u1F60';

  }
}
