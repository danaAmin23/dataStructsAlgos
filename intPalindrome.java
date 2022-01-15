import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    /*
     checks permutation given string 
     returns boolean
     */

    public static boolean isPalindromePermutation(int number) {
        
        
        String str = Integer.toString(number);        
        StringBuilder str2 = new StringBuilder(str);
        Boolean bool = (str2.reverse().toString().equals(str));

        
                
        return bool;

    }//end isPermutation
    
 
    
}// end result 

public class Solution {
    public static void main(String[] args) throws IOException {        
       System.out.println(Result.isPalindromePermutation(1234321));
    }//end main
}//end class solution 
