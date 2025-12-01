public class Employee {
  public String name="";
  public double salary =30000.0;
  public String p="junior";
  public void newEmployee(String name){
    this.name=name;
  }
  public void displayInfo(){
    System.out.println("Employee Name: "+this.name);
    System.out.println("Employee Salary: "+this.salary+" tk");
    System.out.println("Employee Designation: "+this.p);
  }
  public void calculateTax(){
    if(salary>50000){
      System.out.println(this.name+" Tax Amount: "+salary*(30.0/100.0)+" Tk");
    }
    else if(salary>30000){
      System.out.println(this.name+" Tax Amount: "+salary*(10.0/100.0)+" Tk");
    }
    else{
            System.out.println("No need to pay tax");
    }
  }
  public void promoteEmployee(String p){
    this.p=p;
    if(p.equals("manager")){
      this.salary=salary+75000.00;
    }
    if(p.equals("lead")){
      this.salary=salary+50000;
    }
    if(p.equals("senior")){
      this.salary=salary+25000;
    }
    System.out.println(this.name+" has been promoted to "+this.p);
    System.out.println("New Salary: "+this.salary);
    
  }
}