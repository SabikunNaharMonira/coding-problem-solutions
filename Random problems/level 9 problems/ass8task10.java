public class ass8task10{
  public static void main(String args[]){
    double t = convertToCm(16);
    System.out.println(t + " cm");
   double [] cheetos_inches = new double[]{10.0, 12.0, 14.0, 16.0, 18.0};
    double averageLength = findAvgCm(cheetos_inches);
    System.out.printf("The average Cheeto length is %.2f cm\n", averageLength);
  }
  public static double convertToCm(double a){
    double d=a*2.54;
    return d;
  }
  public static double findAvgCm(double [] arr){
    double result=0.0;
    int count = 0;
    for(int i=0 ; i<arr.length ; i++){
      double x=arr[i];
      result+=convertToCm(x);
      count++;
    }
    result=result/count;
    return result;
  }
  
}


