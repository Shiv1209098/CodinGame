/*ASCII art allows you to represent forms by using characters. To be precise, in our case, these forms are words. For example, the word "MANHATTAN" could be displayed as follows in ASCII art:

 
# #  #  ### # #  #  ### ###  #  ###
### # # # # # # # #  #   #  # # # #
### ### # # ### ###  #   #  ### # #
# # # # # # # # # #  #   #  # # # #
# # # # # # # # # #  #   #  # # # #
 
​Your mission is to write a program that can display a line of text in ASCII art in a style you are given as input.

 	Game Input
Input
Line 1: the width L of a letter represented in ASCII art. All letters are the same width.

Line 2: the height H of a letter represented in ASCII art. All letters are the same height.

Line 3: The line of text T, composed of N ASCII characters.

Following lines: the string of characters ABCDEFGHIJKLMNOPQRSTUVWXYZ? Represented in ASCII art.

Output
The text T in ASCII art.
The characters a to z are shown in ASCII art by their equivalent in upper case.
The characters that are not in the intervals [a-z] or [A-Z] will be shown as a question mark in ASCII art.
Constraints
0 < L < 30
0 < H < 30
0 < N < 200*/

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
    int L = in.nextInt();
    in.nextLine();
    int H = in.nextInt();
    in.nextLine();
    String T = in.nextLine().toUpperCase();
    String [][] chars= new String[27][H];
    for (int i = 0; i < H; i++) {
        String ROW = in.nextLine();
        for(int j = 0; j < 27; j++){
            chars[j][i] = ROW.substring(j*L, (j+1) * L);
        }
    }
    for (int i = 0; i < H; i++) {
        for(char x : T.toCharArray() ){
            x -= 65;
            if(x < 0 || x > 26) x = 26;
            System.out.print(chars[x][i]);
        }
        System.out.println();
    }
  }
}
    
