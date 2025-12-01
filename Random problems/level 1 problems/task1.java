//checked
public class task1{
  public static void main(String args[]){
    int x=5;
    int y=17;
    int z=-5;
    if(x>y && y>z){
      System.out.println("largest number: "+x);
    }
    else if(y>x && y>z){
      System.out.println("largest number: "+y);
    }
    else if(z>x && z>y){
      System.out.println("largest number: "+z);
    }
  }
}