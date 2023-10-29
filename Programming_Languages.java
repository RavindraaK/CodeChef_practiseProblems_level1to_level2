/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Programming_Language
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner read =  new Scanner(System.in);
		int t = read.nextInt();
		
		while(t-- > 0)
		{
		    int a = read.nextInt();
		    int b = read.nextInt();
		    int c = read.nextInt();
		    int d = read.nextInt();
		    int e = read.nextInt();
		    int f = read.nextInt();
		    
		    if(a > b)
		    {
		        int s = a;
		        a = b ;
		        b = s; 
		    }
		    if(c > d)
		    {
		        int z = c;
		        c = d;
		        d = z; 
		    }
		    if(e > f)
		    {
		        int q = e;
		        e = f;
		        f = q;
		    }
		    
		    if(a == c && b == d)
		    {
		        System.out.println("1");
		    }
		    else if(a == e && b == f)
		    {
		        System.out.println("2");
		    }
		    else
		    {
		        System.out.println("0");
		    }
		}
	}
}
