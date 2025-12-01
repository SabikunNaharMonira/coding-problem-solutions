public class BankAccount{
  public int acc;
  public String type="";
  public String printDetails(){
    String s;
    if(this.type.equals("")){
      s="Account No: "+this.acc+"\n"+"Type: Not Set";
    }
    else{
      s="Account No: "+this.acc+"\n"+"Type: "+this.type;
    }
    return s;
    
  }
  
  public void setInfo(int a,String s){
    this.acc=a;
    this.type=s;
    System.out.println("Account information updated!");
  }
}