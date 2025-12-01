import java.util.Scanner;
public class asg5task5{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    String s1=sc.nextLine();
    int vcount=0;
    int ccount=0;
    for(int i=s1.length()-1; i>=0 ; i--){
      char x =s1.charAt(i);
      if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
        vcount++;
      }
      else{
        ccount++;
      }
     
    }
    if(vcount%3==0 && ccount%5==0){
      System.out.println("Aaarr! Me Plunder!!");
    }
    else{
      System.out.println("Blimey! No Plunder!!");
    }
  }
}