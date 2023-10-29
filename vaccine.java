/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class vaccine
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int d=sc.nextInt();
		    int l=sc.nextInt();
		    int r=sc.nextInt();
		    
		    if(d>=l)
		    {
		        if(d<=r)
		        {
		            System.out.println("Take second dose now");
		        }
		        else
		        {
		            System.out.println("Too Late");
		        }
		    }
		    else
		    {
		        System.out.println("Too Early");
		    }
		}
	}
}
