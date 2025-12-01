public class StudentTester{
  public static void main(String args[]){
    //classname variable = new classname
    University u1 = new University();  // object  / instance 1
    University u2 = new University();
    System.out.println(u1);
    System.out.println(u2);
    System.out.println(u1.name);
    System.out.println(u2.name);
    u1.name="Imperial College London";
    u1.country = "England";
    u2.name =  "BRAC University";
    u2.country="Bangladesh";
    System.out.println(u1.name+" "+ u1.country );
    System.out.println(u2.name+" "+ u2.country );
    
  }
}


  