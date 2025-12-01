public class Student {
  public static int t_stu = 0;
  public static int c_stu = 0;
  public static int o_stu = 0;
  public static int count = 1;
  
  public int id;
  public double cg;
  public String name;
  public String dept;
  
  
  public Student(String a, double b) {
    name = a;
    cg = b;
    dept = "CSE";
    id = count++;
    c_stu++;
    t_stu++;
  }
  
  public Student(String a, double b, String dept) {
    name = a;
    cg = b;
    this.dept = dept;
    id = count++;
    if(dept.equals("CSE")){
      c_stu++;
    } 
    else{
      o_stu++;
    }
    t_stu++;
  }
  public void individualDetail() {
    System.out.printf("ID: %d \nName: %s \nCGPA: %.2f \nDepartment: %s\n", id, name, cg, dept);
  }
  public static void printDetails() {
    System.out.printf("Total Student(s): %d\nCSE Student(s): %d\nOther Department Student(s): %d\n", t_stu, c_stu, o_stu);
  }
}
