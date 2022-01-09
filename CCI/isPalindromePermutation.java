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

    public static boolean isPalindromePermutation(String str) {
      
        //boolean we are return  
        //even string sice dogdgo; 2 of each char 
        //if odd all chars must be multiple except 1 char, middle char //dgoagdo
        
        //remove whitespace and places chars in hashmap, if we are outside our conditions above
        //then return false 
         str = str.replaceAll(" ","");
         str = sortString(str);
        int trueSize = str.length();
        int odds = 0;
        
       
        HashMap<Character, Integer> charCodes = new HashMap<Character, Integer>();        
        for(int i = 0;i<trueSize;i++){
           char charCode = str.charAt(i);
            if(charCodes.get(charCode)!=null){        
                charCodes.put(charCode,charCodes.get(charCode)+1);
               // return "duplicate found";
            }
            else{
                charCodes.put(charCode,1);
            }
        }//for 
        
        //iterate throug HashMap and count odds, if odds>1
         for (Map.Entry ch : charCodes.entrySet()) {
            if((int) ch.getValue() % 2 != 0){
                odds++;
            }
          System.out.println("Key: "+ch.getKey() + " & Value: " + ch.getValue());
        }
        
        boolean bool = (odds>1) ? false : true;
        return bool;
    }//end isPermutation
    
    public static String sortString(String content){
        
        //convert string to array and handle case sensitivity
        char[] chars = content.toLowerCase().toCharArray();
        //sort the chars 
        Arrays.sort(chars);
        return new String(chars);
        
    }//end sortString()
    
}// end result 

public class Solution {
    public static void main(String[] args) throws IOException {        
       System.out.println(Result.isPalindromePermutation("danaanadsl"));
    }//end main
}//end class solution 
