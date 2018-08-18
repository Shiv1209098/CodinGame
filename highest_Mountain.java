
============== CodinGame - 1 easy ====================

Destroy the mountains before your starship collides with one of them. For that, shoot the highest mountain on your path.
Rules
At the start of each game turn, you are given the height of the 8 mountains from left to right.
By the end of the game turn, you must fire on the highest mountain by outputting its index (from 0 to 7).
Firing on a mountain will only destroy part of it, reducing its height. Your ship descends after each pass.  

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            int hmax = 0; 
             int i_max = 0;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                if(mountainH > hmax){
                 hmax = mountainH;
                    i_max = i;
            }
            }
 System.out.println(i_max); // The index of the mountain to fire on.


            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");                  
        }
       
    }
}





