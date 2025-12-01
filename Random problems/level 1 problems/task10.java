//checked
public class task10{
  public static void main(String args[]){
    int x=5;
        int y=5;
        int z=5;
      if (x==y && x==z && y==z){
           System.out.println("This is a Equilateral triangle");
      }
      else if (x==y && y!=z){
          System.out.println("This is a Isosceles triangle");
      }
      else if(x!=z||x!=y||z!=y){
           System.out.println("this is a Scalene triangle");
      }
  }
}