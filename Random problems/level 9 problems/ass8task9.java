import java.util.Scanner;
public class ass8task9{
  public static void main(String args[]){
    getScores();
  }
  public static void getScores(){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int[] studentScores = new int[n];
    char[] studentGrades = new char[n];
    for(int i=0 ; i<n ; i++){
      studentGrades[i]=sc.next().charAt(0);
    }
    for(int i=0 ; i<n ; i++){
      char x=studentGrades[i];
      if(x=='A'){
        studentScores[i]=100;
      }
      else if(x=='B'){
        studentScores[i]=90;
      }
      else if(x=='C'){
        studentScores[i]=70;
      }
      else{
        studentScores[i]=0;
      }
    }
     for(int i=0 ; i<n ; i++){
       System.out.println(studentScores[i]);
     }
  }
}
    
      
                                
  