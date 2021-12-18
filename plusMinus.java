import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    
    //counter variables 
    int listSize = arr.size();
    int pos=0;
    int min=0;
    int even=0;
    
        for(int i=0;i<=listSize-1;i++){
            
          int listElement = arr.get(i); 
          
            //if listElement is - + 0 increment counters
                if (listElement == 0) {
                        even++;
                }
                else if (listElement>0){
                        pos++;
                }
                else if (listElement<0) {
                        min++;
                }
        }//end For
       
        System.out.println(String.format("%.6f", (float) pos/listSize));
        System.out.println(String.format("%.6f", (float) min/listSize));
        System.out.println(String.format("%.6f", (float) even/listSize));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
