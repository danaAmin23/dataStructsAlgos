import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        int len = s.length();
        boolean pm = false;

        //look at second last index, if its PM add 12 
        if (Character.toUpperCase(s.charAt(len - 2)) == 'P') {
            pm = true;
        }

        //split string by : 
        String[] parts = s.split(":");
        String segment1 = parts[0];
        String segment2 = parts[1];
        String segment3 = parts[2];
        segment3 = segment3.charAt(0) + "" + segment3.charAt(1);

        int segmentHours = Integer.parseInt(segment1);

        if (segmentHours >= 12 && !pm) {
            segmentHours -= 12;

        }

        if (segmentHours < 12 && pm) {
            segmentHours += 12;

        }

        if (segmentHours < 12) {
            return "0" + segmentHours + ":" + segment2 + ":" + segment3;
        }



        return segmentHours + ":" + segment2 + ":" + segment3;


    }



}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
