import java.util.Scanner;
public class asg5task6{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    String s1=sc.nextLine();
    String backward="";
    String sp=" ";
    String tmp="";
    for(int i=0 ; i<s1.length() ; i++){
    char current=s1.charAt(i);
    if(current==' '){
      backward=tmp+sp+backward;
      tmp="";
    }
    else{
      tmp+=current;
    }
    }
    System.out.println(tmp+sp+backward);
  }
}