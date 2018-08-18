======================  CodinGame = 2 =========================================================================================================================

Write a program that prints the temperature closest to 0 among input data. 
If two numbers are equally close to zero, positive integer has to be considered 
closest to zero (for instance, if the temperatures are -5 and 5, then display 5).

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        
         if(n<=0){
        System.out.println(0);
        return;
        }
        
        int closest = 0;
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
       if(closest == 0 || Math.abs(closest) > Math.abs(t) || Math.abs(closest) == Math.abs(t) && closest < t) 
					closest = t;
        }
        
       
        
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(closest);
    }
}
