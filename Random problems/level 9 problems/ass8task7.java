public class ass8task7{
  public static void main(String args[]){
    int [] arr={6, 13, 28, 17, 3, 9, 11, 23, 10, 29, 12, 7};
    for(int i=0 ; i<arr.length ;i++){
      int x = arr[i];
      boolean flag1 = isPrime(x);
      boolean flag2 = isPerfect(x);
      if(flag1){
        System.out.println(arr[i]+" : "+i);
      }
    }
      for(int i=0 ; i<arr.length ;i++){
      int x = arr[i];
      boolean flag2 = isPerfect(x);
      if(flag2){
        System.out.println(arr[i]+" : "+i);
      }
      }
    }

  public static boolean isPrime(int a){
    int count=0;
    boolean flag=false;
    for(int i=2 ; i<a ; i++){
      if(a%i==0){
        count++;
      }
    }
    if(count==0){
      flag=true;
    }
    return flag;
  }
  public static boolean isPerfect(int a){
    int result=0;
    boolean flag = false;
    for(int i=1 ; i<a ; i++){
      if(a%i==0){
        result+=i;
      }
    }
    if(result==a){
      flag=true;
    }
    return flag;
  }
}