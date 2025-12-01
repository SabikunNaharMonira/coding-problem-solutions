public class Assignment{
  public int tasks;
  public String difficulty;
  public boolean submission ;
  public void printDetails(){
    System.out.println("Number of tasks: "+tasks);
    System.out.println("Difficulty level: "+difficulty);
        System.out.println("Submission required: "+submission);
  }
  public String makeOptional(){
    String a="Assignment will not require submission";
    String b = "Submission is already not required";
    if(this.submission==true){
      return a;
    }
    else{
      return b ;
    }
  }
}