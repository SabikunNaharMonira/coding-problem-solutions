import java.util.Scanner;
public class asg5task4{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    String s1=sc.nextLine();
  String result="";
  for(int i=s1.length()-1; i>=0; i--){
    char currentchar=s1.charAt(i);
    result+=currentchar;
  }
  System.out.println(result);
  }
}
    