public class CustomerService{
  public String [] customer;
  public int front;
  public int arr_count;
  public int limit;
  public int left;
  
  
  public CustomerService(int n){
    this.customer= new String [n];
    this.limit = n;
  }
  
  public void addCustomer(String name){
    if(left==limit){
      System.out.println("Queue is full. Cannot add "+name);
    }
    else{
      customer[arr_count]=name;
      arr_count= (arr_count+1)%limit;
      left++;
      System.out.println("Added: "+name);
    }
  }
  
  public void serveCustomer(){
    if (left == 0) {
      System.out.println("No customers to serve");
    } 
    else{
      System.out.println("Serving " + customer[front]);
      front = (front + 1) % limit;
      left--;
    }
  }
}