public class BracuStudent{
  public String name = "";
  public String des = "";
  public boolean pass = false;
  
  public BracuStudent (String name , String des){
    this.name = name ;
    this.des = des;
  }
  public void showDetails(){
    System.out.printf("Student Name: "+this.name+
                       "\nLives in "+this.des+
                       "\nHave Bus Pass? "+this.pass+"\n");
  }
  public void getPass(){
    this.pass=true;
  }
  public void updateHome(String a ){
    this.des=a;
  }
}