public class CellPhone{
  public String model="";
  public String[] contacts = new String[3];
  public int count=0;
  
  
  public void printDetails(){
    if(this.model.equals("")){
      System.out.println("Phone Model unknown");
    }
    else{
      System.out.println("Phone Model "+this.model);
    }
    System.out.println("Contacts Stored "+this.count);
    if(this.count>0){
      System.out.println("Stored Contacts:");
      for(int i=0 ; i<count ; i++){
        System.out.println(contacts[i]);
      }
    }
  }
  public void storeContact(String a){
    if(this.count<this.contacts.length){
    this.contacts[count]=a;
      this.count++;
      System.out.println("Contact Stored");
    }
    else{
      System.out.println("Memory full. New contact can't be stored.");
    }
  }
}