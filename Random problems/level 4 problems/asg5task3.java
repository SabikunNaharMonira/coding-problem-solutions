import java.util.Scanner;
public class asg5task3{
  public static void main(String args[]){
  Scanner sc= new Scanner(System.in);
  String s1=sc.nextLine();
   char divider=sc.nextLine().charAt(0);
  String result="";
  for (int i=0; i<s1.length() ; i++){
    char currentchar= s1.charAt(i);
    if(currentchar==divider){
      System.out.println(result);
      result="";
    }
    else{
      result+=currentchar;
    }
  }
  System.out.println(result);
  }
}