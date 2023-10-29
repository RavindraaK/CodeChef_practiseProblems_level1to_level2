/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Weight_Balance
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // Consume the newline
        
        for (int t = 0; t < T; t++) {
            int w1 = sc.nextInt();
            int w2 = sc.nextInt();
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int M = sc.nextInt();
            
            int minExpectedWeight = w1 + x1 * M;
            int maxExpectedWeight = w1 + x2 * M;
            
            if (w2 >= minExpectedWeight && w2 <= maxExpectedWeight) {
                System.out.println(1); // Correct result
            } else {
                System.out.println(0); // Incorrect result
            }
        }

	}
}
