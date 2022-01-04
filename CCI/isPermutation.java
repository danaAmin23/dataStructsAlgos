import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    /*
     checks permutaion given 2 strings, check if one is a permutation of the other.
     ie god can be changed to dog;
     */

    public static boolean isPermutation(String a,String b) {
        //boolean we are return  
        boolean bool = false;
        
            //if length of a != b return false, sizes are different cant be permutation 
            if(a.length()==b.length()){
                bool= false;   
            }//end if 

           //sort the strings and then compare if they are equal
            if(sortString(a).equals(sortString(b))){
                bool= true;
            }
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
       System.out.println(Result.isPermutation("dog","dOg"));
    }//end main
}//end class solution 
