import java.util.Scanner;

public class asg5task7 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    String result = "";
     for (int i = 0; i < s1.length(); i++) {
       char ch = s1.charAt(i);
       boolean common = false;
        for (int j = 0; j < s2.length(); j++) {
          if (ch == s2.charAt(j)) {
            common = true;
             break;
            }
        }
        if (!common) {
          reult += ch;
        }
    }
    for (int i = 0; i < s2.length(); i++) {
     char ch = s2.charAt(i);
      boolean common = false;
      for (int j = 0; j < s1.length(); j++) {
    if (ch == s1.charAt(j)) {
      common = true;
       break;
      }
       }
    if (!common) {
    result += ch;
   }
 }
     for(int i=0 ; i<result.length() ; i++){
      char x= result.charAt(i);
       System.out.print((char)(x-32));
     }
        System.out.println();
    }
}
