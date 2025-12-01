//checked
public class task2{
  public static void main(String args[]){
    int marks=82;
    String grade ="";
    if (marks>=90){
      grade="A";
    }
    else if (marks>=85 && marks<=89){
      grade="A-";
    }
    else if (marks>=70 && marks<=84){
      grade="B";
    }
    else if (marks>=57 && marks<=69){
      grade="C";
    }
    else if (marks>=50 && marks<=56){
      grade="D";
    }
    else{
      grade="F";
    }
    System.out.println("Your grade is "+grade);
  }
}