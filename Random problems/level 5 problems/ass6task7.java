//done
import java.util.Arrays;
public class ass6task7 {
    public static void main(String args[]) {
        int[] arr = {23, 100, 23, 56, 100};
        boolean isDuplicate = false;
        boolean unique=true;
        int n= arr.length;
        int k=0;
        int count=0;
        
        //counting how many unique number
        for (int i = 0; i <n; i++) {
          isDuplicate=false;
            for (int j =i+1; j<n; j++) {
                if (arr[i] == arr[j]) {
                  isDuplicate=true;
                    break;
                } 
            }
            if(isDuplicate==false){
              count++;
            }  
        }
        
        //making new array with that count
        int [] arr2=new int[count];
        
        //taking only the unique values for the new array
        for (int i = 0; i < n; i++) {
            unique=true;
            for (int j =i+1; j <n; j++) {
                if (arr[i] == arr[j]) {
                    unique=false;
                    break;
                }
            }
            //here is a bit tricky
            if(unique==true){
              arr2[k]=arr[i];
              k++;
            }
        }
        
        //printing the arrays
        System.out.print("Input array: ");
        for(int i=0; i<arr.length; i++){
         System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("New array: ");
        for(int i=0; i<arr2.length; i++){
          System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }
}

        