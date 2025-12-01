public class Teacher {
  public String name = "";
  public String ini ="";
   public String [] arr= new String [3];
   public int count = 0;
   
   public Teacher (String name , String ini ){
     System.out.println("A new teacher has been created");
     this.name = name ; 
     this.ini= ini;
   }
   public void addCourse(Course c){
     arr[count++] = c.cname;
   }
   public void printDetail(){
     System.out.printf("Name: "+this.name+
                       "\nInitial: "+this.ini+
                       "\nList of courses:\n");
     for(int i = 0 ; i<count ; i++){
       System.out.println(arr[i]);
     }
   }
}
                         
                         