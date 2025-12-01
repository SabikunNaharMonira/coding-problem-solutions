public class Reader{
  public String name="";
  public String book [];
  public int capacity = 0;
  public int book_count=0;
  
  
  public String createReader(String name, int l){
    this.name=name;
    book = new String [l];
    this.capacity=l;
    String s = "A new reader is created!";
    return s;
  }
  
  
  public void readerInfo(){
    System.out.println("Name: "+this.name);
    System.out.println("Capacity: "+this.capacity);
    System.out.println("Books:");
    if(book_count==0){
      System.out.println("No books added yet");
    }
    else {
      for(int i = 0 ; i< book_count ; i++){
        System.out.println("Book "+(i+1)+": "+book[i]);
      }
    }
  }
  
  
  public void addBook(String name){
    if (book_count < capacity) {
      book[book_count++]=name;
    }
    else{
      System.out.println("No more capacity");
    }
  }
}

