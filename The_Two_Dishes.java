
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class The_Two_Dishes
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner read = new Scanner(System.in);
	    int t = read.nextInt();
	    
	    while(t-- > 0)
	    {
	        int n = read.nextInt();
	        int s = read.nextInt();
	        
	        if(s <= n)
	        {
	            System.out.println(s);
	        }
	        else{
	            System.out.println((n*2) - s);
	        }
	    }
	}
}
