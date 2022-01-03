import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    /*
     checks to see if string has unique characters
     */

    public static boolean isUniqueChar(String n) {
        //loop through string,and char array 
        boolean bool = true;
        List<Character> chars = new ArrayList<>();
        
            //loop through string,and char array 
            for(int i=0;i<n.length();i++){
                if(chars.contains(n.charAt(i))==false){
                      chars.add(n.charAt(i));
                 }//end if 
               else{
                bool = false;
                }//end else
            }//end for 
        
            //if char is in array return false  
        return bool;
    }
    
}// end result 

public class Solution {
    public static void main(String[] args) throws IOException {        
       System.out.println(Result.isUniqueChar("ABCDE--"));
       System.out.println(Result.isUniqueChar("12324"));
       System.out.println(Result.isUniqueChar("aAbCc"));

    }
}
