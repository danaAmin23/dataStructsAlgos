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
    }// ens is UniqueChar
    
   //alternative way 
        /*
     checks to see if string has unique characters
     */

    public static boolean isUniqueChar2(String n) {
        //loop through string,and char array 
        boolean bool = true;
        boolean charSet[] = new boolean[128];
    
            //loop through string,and char array 
            for(int i=0;i<n.length();i++){
                //get char code of char 
                int charCode = n.charAt(i);
                //if we found the element at index charCode we already found it 
                if(charSet[charCode]){
                    return false;
                }//end if 
                else{
                    
                    charSet[charCode]=true;
                }//end else 
            }//end for 
        
            //if char is in array return false  
        return true;
    }//end isUnique2
    
}// end result 

public class Solution {
    public static void main(String[] args) throws IOException {        
       System.out.println(Result.isUniqueChar("ABCDE--"));
       System.out.println(Result.isUniqueChar("12324"));
       System.out.println(Result.isUniqueChar2("aAbCc"));

    }
}
