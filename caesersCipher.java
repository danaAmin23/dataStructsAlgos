import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        // Write your code here

        //alphabet
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String offsetAlphabet = alphabet;
        
        //what if more than 25?
        
            //constantly loop througth new alphabet and update offsetAlphabet 
            for (int i=0;i<k;i++){
                
                //first char of offset updated offsetAlphabet 
                String c = offsetAlphabet.substring(0,1);
                
                //Substring of offsetAlphabet except first char
                String sub = offsetAlphabet.substring(1,alphabet.length());
                offsetAlphabet = sub+ c;
                
            }//
    
        String cipher = "";


        //middleOutz
        //the postion of the string char is = to the position in the new alphabet 
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            boolean isUpperCase = Character.isUpperCase(c);
            int pos = alphabet.indexOf(Character.toLowerCase(c));;

            //if the char is in og Alphabet ie is special char 
            if (pos > -1) {
                char d = offsetAlphabet.charAt(pos);
                if (isUpperCase) {
                    cipher += Character.toUpperCase(d);

                } else {
                    cipher += d;
                }

            } //end if 
            else {
                cipher += s.charAt(i);
            }//end else 

        }
        return cipher;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
