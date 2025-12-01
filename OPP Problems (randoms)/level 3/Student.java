public class Student {
  public String email;
  public boolean ls ;
  public int id ;
  public String dept;
  public String name ;
  public String password;
  public String course [] = new String [3];
  
  public Student (String name , int id , String dept){
    this.name = name;
    this.id = id;
    this.dept = dept;
    System.out.println("Student object is created");
  }
}