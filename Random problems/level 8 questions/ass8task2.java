import java.util.Scanner;
public class ass8task2{
      public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String S = sc.nextLine();
        String S1 = sc.nextLine();
        String S2 = sc.nextLine();
        modifyStrings(S, S1, S2);
    }

    public static void modifyStrings(String S, String S1, String S2) {
        String result = "";
        int i = 0; 

        while (i < S.length()) {
            boolean isMatch = true;
            for (int j = 0; j < S1.length(); j++) {
                if (i + j >= S.length() || S.charAt(i + j) != S1.charAt(j)) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                result += S2;
                i += S1.length();
            } else {
                result += S.charAt(i);
                i++;
            }
        }
        System.out.println(result);
    }
}