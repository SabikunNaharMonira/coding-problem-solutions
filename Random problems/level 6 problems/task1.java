public class ass7task1{
  public static void main(String args[]){
    evenChecker(10);
    boolean result=isEven(10);
    boolean result2=isPos(-5);
    System.out.println(result);
     System.out.println(result2);
     sequence(-7);
  }
  public static void evenChecker(int a){
    if(a%2==0){
      System.out.println("Even!!");
    }
    else{
      System.out.println("Odd!!");
    }
  }
  public static boolean isEven(int a){
    boolean flag=false;
    if(a%2==0){
      flag=true;
      return flag;
    }
    else{
      return flag;
    }
  }
  public static boolean isPos(int a){
    boolean flag=false;
    if(a>0){
      flag=true;
    }
    else{
      flag=false;
    }
    return flag;
  }
  public static void sequence(int a){
    boolean pos=isPos(a);
    if(pos==true){
      for(int i=0; i<a ;i++){
        boolean even=isEven(i);
        if(even){
          System.out.print(i+" ") ;
        }
      }
    }
    else{
      for(int i=a; i<0 ; i++){
        boolean odd=isEven(i);
        if(!odd){
          System.out.print(i+" ") ;
        }
      }
    }
  }
}
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
