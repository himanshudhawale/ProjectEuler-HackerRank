import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);                   
        long t = in.nextLong();                                 
        for(int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();                            
            long sum = 0;                                       
            
            long three = (n-1) / 3;               
            three = 3*three * (three+1)/2;
            long five = (n-1) / 5;                 
            five = 5*five * (five+1)/2;
            long both = (n-1) / 15;                  
            both = 15*both * (both+1)/2;
            
            sum = three + five - both;
            System.out.println(sum);                            
        }
        
    }
}


