public class Shelf{
  public int capacity=0;
  public int num=0;
  public void showDetails(){
    System.out.println("Shelf capacity: "+capacity+"\nNumber of books: "+num);
  }
  public void addBooks(int book){
    if(capacity==0){
      System.out.println("Zero capacity. Cannot add books.");
    }
    else if(capacity < (book+this.num)){
      System.out.println("Exceeds capacity");
    }
    else{
      this.num+=book;
      System.out.println(book+" books added to shelf");
    }
  }
}
    
