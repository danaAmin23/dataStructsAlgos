import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    
    /*
        urlify a string - all the spaces in the string are to be replaced by 20%
        
        input = string - Mr John Smith 
                13 - true length 
        output : Mr%20John%20Smith
     */

    public static String urlify(String str,int len) {
     
         int spaces = 0;
        
        //find spaces in string
        for (int i=0;i<len;i++){
            if(str.charAt(i) == ' '){
                spaces++;
            }//end int 
        }//end for 
    
        //space found so we need to move needle 2 more to the right 
        int sizeOfUrl = len + (spaces *2); 
        
        // Creating array of new  string length
        char[] chars = new char[sizeOfUrl]; 
    
        //loop through str 
        int j = 0;
            for(int i =0;i<len;i++){
                
                if(str.charAt(i) == ' '){
                    
                    chars[j] = '%';   // chars[2]
                    chars[j+1] = '2'; // chars[3]
                     chars [j+2] = '0'; //chars[4]
                     j+=3;
                }
                else{
                   chars[j] = str.charAt(i);   
                     j++;
                }
            }//end for 
        
       return new String(chars);
    }//end urlify
    
    
}// end result 

public class Solution {
    public static void main(String[] args) throws IOException {        
       System.out.println(Result.urlify("Mr John Smith     ",13));
    }//end main
}//end class solution 
