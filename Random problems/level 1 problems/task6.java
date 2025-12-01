//checked done
public class task6{
  public static void main(String args[]){
    int x=10;
      if(x<0){
      x=2*x;
    }
    else if(x<2 && x>=0){
      x=x+1;
    }
    else if(x>=2 && x<5){
      x=x*x-1;
    }
    else if(x>=5){
      x=3*x*x+2;
    }
    System.out.print("output: "+x);
    
    
    
  }
}