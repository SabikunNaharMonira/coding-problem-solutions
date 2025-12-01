public class ass7task3{
  public static void main(String args[]){
      boolean res = isTriangle(3,2,1);
        System.out.println( res );
        triArea(7,5,10);
  }
  public static boolean isTriangle(int a,int b,int c){
    boolean flag=false;
    boolean flag2=false;
    boolean flag3= false;
    boolean result=false;
    if(a+b>c){
      flag=true;
    }
    if(b+c>a){
      flag2=true;
    }
    if(c+a>b){
      flag3=true;
    }
    if(flag==true&&flag2==true&&flag3==true){
      result=true;
    }
    return result;
  }
  public static void triArea(int a, int b, int c){
    boolean tri=isTriangle(a,b,c);
    if(tri==true){
      double s=(a+b+c)/2.0;
      double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
      System.out.printf("%.3f \n",area);
    }
    else{
      System.out.println("Can’t form triangle");
    }
  }
}
  

  