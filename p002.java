import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long sum = 0;
            
            long n1 = 1;
            long n2 = 2;
            long nextSum = 0;
            
            if (n2 % 2 == 0 && n2 <= n) {
                sum += n2;
            }

            for (int i = 3; i <= n; i++) {
                nextSum = n1 + n2;
                n1 = n2;
                n2 = nextSum;
                
                if (nextSum % 2 == 0 && nextSum <= n) {
                    sum += nextSum;
                }
                
                if (nextSum > n) {
                    break;
                }
            }
            
            System.out.println(sum);           
        }
    }
}

