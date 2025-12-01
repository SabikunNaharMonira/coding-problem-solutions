public class Usis{
  public Student [] obj = new Student [5];
  public int ta=0;
  
  public Usis(){
    System.out.println("Usis is ready to use!");
  }
  public void login(Student obj){
    if(obj.email==null || obj.password == null){
      System.out.println("Email and password need to be set.");
    }
    else{
      obj.ls=true;
      System.out.println("Login successful");
    }
  }
  
  public void advising( Student obj ){
    if(!obj.ls){
      System.out.println("Please login to advise courses!");
    }
    else{
      System.out.println("You haven't selected any courses.");
    }
  }
  public void advising(Student obj , String c1 , String c2 , String c3 , String c4){
    if(!obj.ls){
      System.out.println("Please login to advise courses!");
    }
    else{
      System.out.println("You need special approval to take more than 3 courses.");
    }
  }
  public void advising(Student obj , String c1 , String c2 , String c3 ){
    if(!obj.ls){
      System.out.println("Please login to advise courses!");
    }
    else{
      if(ta==4){
      this.obj[ta]=obj;
      obj.course[0]=c1;
      obj.course[1]=c2;            
      obj.course[2]=c3;
      ta++;
      System.out.println("Advising successful!");
      }
      else if(ta<4){
        this.obj[ta++]=obj;
      obj.course[0]=c1;
      obj.course[1]=c2;            
      obj.course[2]=c3;
      System.out.println("Advising successful!");
      }
    }
  }
  public void allAdviseeInfo(){
    System.out.println("Total Advisee: "+this.ta);
    for(int i = 0 ; i<ta ; i++){
      System.out.printf("Name: "+obj[i].name+
                        " ID: "+obj[i].id+
                        "\nDepartment: "+obj[i].dept+
                        "\nAdvised Courses:\n");
      for(int j = 0 ; j<obj[i].course.length ; j++){
        System.out.print(obj[i].course[j] + " ");
      }
      System.out.println();
      System.out.println("==============");
    }
  }
}
  