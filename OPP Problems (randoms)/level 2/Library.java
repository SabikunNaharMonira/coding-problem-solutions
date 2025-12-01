public class Library{
  public int cap=0;
  public String [] arr;
  public int count=0;
  public void setBookCapacity(int cap){
    this.cap=cap;
    arr = new String [cap];
  }
  public void addBook(String s){
    int x= arr.length;
    if(count >= this.cap){
       System.out.println("Exceeds maximum capacity. You can't add more than "
          +this.cap+" books");
    }
    else {
     this.arr[count]=s;
    count++;
    System.out.println("Book '"+s+"' added to the library");
    }
  }
  public void printDetail(){
    System.out.println("Maximum Capacity: "+this.cap
                         +"\nTotal Books: "+(count)
                         +"\nBook list:");
    for(int i =0 ; i<count ; i++){
      System.out.println(this.arr[i]);
    }
  }
}
  