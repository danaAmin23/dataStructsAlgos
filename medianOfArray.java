import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
  /*
   checks median given arr 
   returns dbl
   */

  public static double medianNumber(double[] arr) {

    //sort array 
    int length = arr.length;
    Arrays.sort(arr);

    for (int i = 0; i < arr.length; i++) {
      int index = i;
      System.out.println("index " + ++index + "-" + arr[i]);
    }

    int middle = 0;
    double median = 0;

    // if arr.length odd divide array /2
    if (length % 2 == 0) {
      //even size 
      median = arr[arr.length / 2] + arr[(arr.length / 2) - 1];
      median = median / 2;
    } else {
      //odd size
      middle = arr.length / 2;
      median = arr[middle];

    }

    return median;
    //return arr[middle];

  } //end medianNum

} // end result 

public class Solution {
  public static void main(String[] args) throws IOException {

    double[] arr = new double[4];
    for (int i = 0; i < arr.length; i++) {
      int rand = (int)(Math.random() * 100) + 1;
      arr[i] = rand;
    }

    System.out.println(Result.medianNumber(arr));
  } //end main
} //end class solution 
