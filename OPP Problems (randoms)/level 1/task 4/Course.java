public class Course{
   public String name; 
   public String code;
   public int credit;

  public void updateDetails(String a , String b , int c){
    this.name=a;
    this.code=b;
    this.credit=c;
  }
  public void displayCourse(){
    System.out.println("Course Name: ");
    System.out.println(this.name);
    System.out.println("Course Code: "+this.code);
    System.out.println("Course Credit: "+credit);
  }
}