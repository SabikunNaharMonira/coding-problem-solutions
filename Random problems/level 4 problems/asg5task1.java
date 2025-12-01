
import java.util.Scanner;
public class asg5task1{
  public static void main(String args[]){
  Scanner sc= new Scanner(System.in);
  String line=sc.nextLine();
  String result="";
  for (int i=0; i<line.length() ; i++){
    char currentchar= line.charAt(i);
    if (currentchar>='a' && currentchar<='z'){
      result+=(char)(currentchar-32);
    }
    else {
      result+=currentchar;
    }
  }
  System.out.print(result);
  }
}