import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List < Integer > a) {
        // Write your code here

        // Create a HashMap object called oc
        HashMap < Integer, Integer > oc = new HashMap < Integer, Integer > ();

        int size = a.size();

        int lonelyInt = 0;

        for (int i = 0; i < size; i++) {

            //if it not in hash map then add 
            if (oc.containsKey(a.get(i)) == false) {
                oc.put(a.get(i), 1);
            } //end if 

            //if it is increment its value 
            else {
                int count = oc.get(a.get(i));
                count++;
                oc.put(a.get(i), count);
            }//end else


        }//end for loop 

        //loop through hashmap and if its value - 1 return it
        for (int key: oc.keySet()) {
            if (oc.get(key) == 1) {
               lonelyInt = key;
            }//end if 

        }//end for 

        return lonelyInt;

    }//end func 

}//end class 

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List < Integer > a = new ArrayList < > ();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int result = Result.lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
