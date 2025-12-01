public class ass8task5{
  public static void main(String arg[]){
      int decimal = toDecimal("10");
      String hex = toHex(decimal);
     System.out.println(hex);
  }
  public static int toDecimal(String a){
    int result=0;
    for(int i=0; i<a.length() ; i++){
      int x=((int)a.charAt(i)-48);
      int y=a.length()-1-i;
      result+=x*(Math.pow(2,y));
    }
    return result;
  }
  
  public static String toHex(int a) {
        String result = "";
        while (a > 0) {
         int x = a % 16;
            if (x < 10) {
                result = x + result; 
            }
            else {
                 if(x==10){
        result+="A";
      }
      else if(x==11){
        result+="B";
      }
      else if(x==12){
        result+="C";
      }
      else if(x==13){
        result+="D";
      }
      else if(x==14){
        result+="E";
      }
      else if(x==15){
        result+="F";
      }
            }
            a = a / 16;
        }
        return result;
    }
}
    