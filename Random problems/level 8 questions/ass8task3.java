public class ass8task3{
  public static void main(String args[]){
    //Scanner sc= new Scanner(System.in);
    String arr[]={"cse110@gmail.com", "government@cv.",  "eee@bracu.ac.bd"};
    int count=0;
    for(int i=0 ; i<arr.length ; i++){
      String s1=arr[i];
      boolean flag=check(s1);
      if(flag){
        count++;
      }
    }
    System.out.println(count);
  }

   public static boolean check(String s1){
     boolean con1=false;
    boolean con2=false;
    boolean con3=false;
    boolean con4=false;
    if(s1.charAt(0)>='a' && s1.charAt(0)<='z' || s1.charAt(0)>='A' && s1.charAt(0)<='Z'){
          con1=true;
        }
     for(int j=0 ; j<s1.length() ; j++){
        if(s1.charAt(j)=='@'){
          con2=true;
          char nextone=s1.charAt((j+1));
          if(nextone>='a' && nextone<='z' || nextone>='A' && nextone<='Z'){
              con3=true;
          }
        }
        int x=s1.length()-1;
        if(s1.charAt(j)=='.' && s1.charAt(x)!='.'){
          con4=true;
        }
      }
     if(con1 && con2 && con3 && con4){
        return true;
      }
     else{
       return false;
     }
   }
}

        
                                                  
                                           

