/*
Chuck Norris

Let’s take a simple example with a message which consists of only one character: Capital C. C in binary is represented as 1000011, so with Chuck Norris’ technique this gives:

0 0 (the first series consists of only a single 1)
00 0000 (the second series consists of four 0)
0 00 (the third consists of two 1)
So C is coded as: 0 0 00 0000 0 00

 
Second example, we want to encode the message CC (i.e. the 14 bits 10000111000011) :

0 0 (one single 1)
00 0000 (four 0)
0 000 (three 1)
00 0000 (four 0)
0 00 (two 1)
So CC is coded as: 0 0 00 0000 0 000 00 0000 0 00

 	Game Input
Input
Line 1: the message consisting of N ASCII characters (without carriage return)
Output
The encoded message
Constraints
0 < N < 100
Example
Input
C
Output
0 0 00 0000 0 00


*/

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
        String MESSAGE = in.nextLine();

char[] message = MESSAGE.toCharArray();
       
//convert data into binary format
		StringBuilder binary = new StringBuilder();
		for(char c : message) {
			String res = Integer.toBinaryString(c);
			
			//for non-letters
			while(res.length() < 7) 
			res = '0' + res;
			
			binary.append(res);
		}
		int i = 0;
		char currentChar;
		while(i < binary.length()) {
			if(binary.charAt(i) == '0') {
				System.out.print("00 ");
				currentChar = '0';
			}
			else {
				System.out.print("0 ");
				currentChar = '1';
			}
			while(binary.charAt(i) == currentChar) {
				System.out.print("0");
				i++;
				if(i >= binary.length()) break;
			}
			if(i < binary.length()) 
			
			System.out.print(" ");
		}
    }
}