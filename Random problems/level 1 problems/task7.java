//checked
public class task7{
  public static void main(String args[]){
    int student_id=20201307;
    double x=student_id%Math.pow(10,6);
    double z=student_id/Math.pow(10,6);
    int a=(int)z;
    double m =(x/Math.pow(10,5));
    int y=(int)m;
      String session="";
    if(y==1){
     session="Spring";
    }
    else if (y==2){
      session="Fall";
    }
    else if (y==3){
      session="Summer";
    }
    System.out.println("Student Joined BRAC in: " +session+" "+a);
    
    
    
  }
}