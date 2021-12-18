import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Collections;


class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    
    
            // Sort cars 
            Collections.sort(arr);             
            
            //vars 
            int size = arr.size()-1;//4
            int window = size-1;
            long min = 0;
            long max  = 0;
           
            //loop through collection 
            
            
            int j = size;
            
            for (int i =0; i<size;i++){
             
             
             min+= arr.get(i); 
             max+= arr.get(j);  
            
            j--;
            
                
            }
                       
            System.out.println(min + " " + max);
          
          
          
          
           
           
            
            
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
