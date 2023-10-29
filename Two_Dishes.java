import java.util.*;
import java.lang.*;
import java.io.*;

class Two_Dishes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner read = new Scanner(System.in);
		int t =  read.nextInt();
		
		while(t-- > 0)
		{
		    int n = read.nextInt();
		    int a = read.nextInt();
		    int b = read.nextInt();
		    int c = read.nextInt();
		    
		    if((a+c) >= n && b >= n)
		    {
		       System.out.println("Yes");
		    }
		    else
		    {
		        System.out.println("No");
		    }
		  
		  
		}
	}
}
