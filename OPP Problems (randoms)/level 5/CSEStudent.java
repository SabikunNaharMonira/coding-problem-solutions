public class CSEStudent extends Student {
  public static int total_Students = 0;
  public static String[] lab_Courses = {"CSE110", "CSE111", "CSE220", "CSE221"};
  
  public CSEStudent(String n, int i) {
    super(n, i);
    total_Students++;  
  }
  public static void details() {
    System.out.println("Total CSE Students: " + total_Students);
    System.out.println("Available Lab Based Courses: ");
    for (int i= 0 ; i<lab_Courses.length;  i++){
      System.out.print(lab_Courses[i] + " ");
    }
    System.out.println();
  }
  
  public void addLabBasedCourse(String course){
    boolean flag = false;
    for (int i= 0 ; i<lab_Courses.length ; i++) {
      if (lab_Courses[i].equals(course)) {
        flag = true;
        break;
      }
    } 
    if(!flag) {
      System.out.println("It is not a lab based course!");
    }
    else{
      courses += " "+course+" ";
    }
  }
}